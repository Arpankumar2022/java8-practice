/**
 * Copyright 2019.
 *//*

package info.isocel.alice.com.referentiel.offre.backend.application.service.impl;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import info.isocel.alice.com.referentiel.commun.EstPresent;
import info.isocel.alice.com.referentiel.offre.backend.domain.modele.dossieroffre.DossierOffreRepository;
import info.isocel.alice.com.referentiel.refcom.backend.application.dto.refcom.ReponseRechercherArticlesDto;
import info.isocel.alice.com.referentiel.refcom.backend.application.dto.refcom.RequeteCodelecRechercherArticlesDto;
import info.isocel.alice.com.referentiel.refcom.backend.application.dto.refcom.RequeteRechercherArticlesDto;
import info.isocel.alice.com.referentiel.refcom.backend.application.dto.refcom.RequeteStructureCommercialeRechercherArticlesDto;
import info.isocel.alice.com.referentiel.refcom.backend.application.dto.refcomcodif.StructureCommercialeDetailsDto;
import info.isocel.alice.com.referentiel.refcom.backend.application.service.RcoCodif;
import info.isocel.alice.com.referentiel.refcom.backend.application.service.impl.RechercherArticlesImpl;
import info.isocel.alice.com.referentiel.refcom.backend.application.service.reporting.ArticleComReportingRepository;
import info.isocel.alice.com.referentiel.refcom.backend.domain.modele.articlecom.ArticleCom;
import info.isocel.alice.com.referentiel.refcom.backend.domain.modele.articlecom.ArticleComRepository;
import info.isocel.alice.com.referentiel.refcom.backend.domain.modele.articlefiliereappro.Article;
import info.isocel.alice.com.referentiel.refcom.backend.domain.modele.articlefiliereappro.ArticleFiliereAppro;
import info.isocel.alice.com.referentiel.refcom.backend.domain.modele.articlefiliereappro.ArticleFiliereApproRepository;
import info.isocel.alice.com.referentiel.refcom.backend.domain.modele.filiereappro.FiliereAppro;
import info.isocel.alice.com.referentiel.refcom.backend.domain.modele.filiereappro.FiliereApproRepository;
import info.isocel.alice.com.referentiel.refcom.backend.domain.modele.filiereappro.FiliereFournisseur;
import info.isocel.alice.com.referentiel.refcom.backend.domain.modele.filiereappro.FournisseurDiffusion;
import info.isocel.alice.com.referentiel.refcom.backend.domain.modele.filiereappro.StructureCommerciale;
import info.isocel.alice.com.referentiel.refcom.backend.domain.reglemetier.VerifierValeurPositiveOuZero;
import info.isocel.alice.com.referentiel.refcom.backend.domain.reglemetier.VerifierValeurStrictementPositive;
import leclerc.wrf.backend.domaine.messages.WrfMessagesMetierManager;
import leclerc.wrf.backend.domaine.reglemetier.RegleMetierLocator;

*//**
 *
 * RechercherArticlesImplTest
 *
 * @author sopra
 *
 *//*
@RunWith(PowerMockRunner.class)
@PowerMockIgnore("javax.management.*")
@PrepareForTest({ RegleMetierLocator.class })
public class RechercherArticlesImplTest {

    @Mock
    private ArticleFiliereApproRepository articleFiliereApproRepository;

    @Mock
    private ArticleComRepository articleComRepository;

    @Mock
    private FiliereApproRepository filiereApproRepository;

    @Mock
    private DossierOffreRepository dossierOffreRepository;

    @Mock
    private RcoCodif rcoCodif;

    @Mock
    private ArticleComReportingRepository articleComReportingRepository;

    @InjectMocks
    RechercherArticlesImpl rechercherArticlesImpl;

    private final EstPresent estPresent = new EstPresent();
    private final VerifierValeurPositiveOuZero verifierValeurPositiveOuZero = new VerifierValeurPositiveOuZero();
    private final VerifierValeurStrictementPositive verifierValeurStrictementPositive = new VerifierValeurStrictementPositive();

    *//**
     * setup for WrfMessagesMetierManager
     *
     *//*
    @Before
    public void setup() {
        PowerMockito.mockStatic(WrfMessagesMetierManager.class);
        PowerMockito.mockStatic(RegleMetierLocator.class);
        PowerMockito
                .when(RegleMetierLocator.getRegleMetierValidation(Matchers.eq("estPresent"), Matchers.eq(Object.class)))
                .thenReturn(estPresent);
        PowerMockito.when(RegleMetierLocator.getRegleMetierValidation(Matchers.eq("verifierValeurPositiveOuZero"),
                Matchers.eq(Integer.class))).thenReturn(verifierValeurPositiveOuZero);

        PowerMockito.when(RegleMetierLocator.getRegleMetierValidation(Matchers.eq("verifierValeurStrictementPositive"),
                Matchers.eq(Object.class))).thenReturn(verifierValeurStrictementPositive);
    }

    *//**
     * test de RechercherArticlesParIdentifiantsImpl Ok
     *//*
    @Test
    public void testRechercherArticlesOk() {
        // PREPARER

        final RequeteRechercherArticlesDto requeteRechercherArticlesDto = new RequeteRechercherArticlesDto(Boolean.TRUE,
                UUID.fromString("808004ff-ffff-ffff-ffff-ffffffffffff"),
                UUID.fromString("808004ff-ffff-ffff-ffff-ffffffffffff"),
                Stream.of(new RequeteStructureCommercialeRechercherArticlesDto(
                        UUID.fromString("808004ff-ffff-ffff-ffff-ffffffffffff"))).collect(Collectors.toList()),
                Stream.of(new RequeteCodelecRechercherArticlesDto("niveauUn", "niveauDeux", "niveauTrois",
                        "niveauQuatre")).collect(Collectors.toList()),
                "codeOuLibelleOuGtinOuRefProduit", Boolean.TRUE, Boolean.TRUE, "typeOffre",
                UUID.fromString("808004ff-ffff-ffff-ffff-ffffffffffff"),
                UUID.fromString("808004ff-ffff-ffff-ffff-ffffffffffff"));

        final ArticleCom articleCom = null;

        Mockito.when(articleComRepository.rechercherParIdentifiantSi(Matchers.any())).thenReturn(articleCom);

        final List<ArticleFiliereAppro> listeArticleFiliereAppro = Stream.of(new ArticleFiliereAppro(Instant.now(),
                Instant.now(), new Article(UUID.fromString("504132ff-ffff-ffff-ffff-ffffffffffff")),
                new info.isocel.alice.com.referentiel.refcom.backend.domain.modele.articlefiliereappro.FiliereAppro(
                        UUID.fromString("604132ff-ffff-ffff-ffff-ffffffffffff"))))
                .collect(Collectors.toList());

        Mockito.when(articleFiliereApproRepository
                .rechercherArticleFiliereApproParIdentifiantSIArticleIdentifiantSIFilereApproDatedebut(Matchers.any(),
                        Matchers.any(), Matchers.any()))
                .thenReturn(listeArticleFiliereAppro);

        final FiliereAppro filiereAppro = new FiliereAppro(Integer.valueOf(12), "LibelleFilier1", "observation1",
                Boolean.valueOf(false), false, false, "modaliteAcheminement1", null,
                new StructureCommerciale(UUID.fromString("504137ff-ffff-ffff-ffff-ffffffffffff")),
                new FournisseurDiffusion(UUID.fromString("504138ff-ffff-ffff-ffff-ffffffffffff")), null,
                new FiliereFournisseur(UUID.fromString("504139ff-ffff-ffff-ffff-ffffffffffff")), null, null, null,
                Instant.now(), null, null, Integer.valueOf(12), Integer.valueOf(13), null, null, null, null, null, null,
                null, null, null, null, null, null, false);

        Mockito.when(filiereApproRepository.rechercherFiliereApproIdentifiantSI(Matchers.any()))
                .thenReturn(filiereAppro);

        final Object[][] data = {};

        Mockito.when(articleComReportingRepository.listerArticlesParIdentifiants(Matchers.any())).thenReturn(data);
        final List<StructureCommercialeDetailsDto> listeStructureCommercialeDetailsDto = new ArrayList<>();

        // SIM_REF_RCO_021
        Mockito.when(rcoCodif.rechercherStructuresCommercialesParId(Matchers.any()))
                .thenReturn(listeStructureCommercialeDetailsDto);

        // EXECUTER
        final List<ReponseRechercherArticlesDto> listeReponseArticleEntreeDto = rechercherArticlesImpl
                .rechercherArticles(requeteRechercherArticlesDto);

        // VERIFIER
        Assert.assertNotNull(listeReponseArticleEntreeDto);

    }

}*/