package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17127e implements InterfaceC11934e {

    /* renamed from: strictfp, reason: not valid java name */
    public static final /* synthetic */ InterfaceC8614e[] f33518strictfp;
    public final C1577e Signature;

    /* renamed from: abstract, reason: not valid java name */
    public final C1577e f33519abstract;
    public boolean ad;
    public final C1577e adcel;
    public final C1577e admob;
    public final C1577e ads;
    public final C1577e advert;
    public final C1577e amazon;
    public final C1577e applovin;
    public final C1577e appmetrica;
    public final C1577e billing;

    /* renamed from: break, reason: not valid java name */
    public final C1577e f33520break;

    /* renamed from: case, reason: not valid java name */
    public final C1577e f33521case;

    /* renamed from: catch, reason: not valid java name */
    public final C1577e f33522catch;

    /* renamed from: class, reason: not valid java name */
    public final C1577e f33523class;
    public final C1577e crashlytics;

    /* renamed from: default, reason: not valid java name */
    public final C1577e f33524default;

    /* renamed from: extends, reason: not valid java name */
    public final C1577e f33525extends;

    /* renamed from: final, reason: not valid java name */
    public final C1577e f33526final;
    public final C1577e firebase;

    /* renamed from: goto, reason: not valid java name */
    public final C1577e f33527goto;

    /* renamed from: implements, reason: not valid java name */
    public final C1577e f33528implements;
    public final C1577e inmobi;

    /* renamed from: interface, reason: not valid java name */
    public final C1577e f33529interface;
    public final C1577e isPro;
    public final C1577e isVip;
    public final C1577e license;
    public final C1577e loadAd;
    public final C1577e metrica;
    public final C1577e mopub;

    /* renamed from: native, reason: not valid java name */
    public final C1577e f33530native;

    /* renamed from: new, reason: not valid java name */
    public final C1577e f33531new;
    public final C1577e premium;
    public final C1577e pro;

    /* renamed from: protected, reason: not valid java name */
    public final C1577e f33532protected;
    public final C1577e purchase;
    public final C1577e remoteconfig;
    public final C1577e signatures;
    public final C1577e smaato;
    public final C1577e startapp;
    public final C1577e subs;
    public final C1577e subscription;

    /* renamed from: super, reason: not valid java name */
    public final C1577e f33533super;
    public final C1577e tapsense;

    /* renamed from: this, reason: not valid java name */
    public final C1577e f33534this;

    /* renamed from: throw, reason: not valid java name */
    public final C1577e f33535throw;

    /* renamed from: try, reason: not valid java name */
    public final C1577e f33536try;
    public final C1577e vip = new C1577e(C5519e.license, this, 2);

    /* renamed from: while, reason: not valid java name */
    public final C1577e f33537while;
    public final C1577e yandex;

    static {
        C13506e c13506e = new C13506e(C17127e.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        f33518strictfp = new InterfaceC8614e[]{c12232e.purchase(c13506e), AbstractC10257e.billing(C17127e.class, "withDefinedIn", "getWithDefinedIn()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "modifiers", "getModifiers()Ljava/util/Set;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "startFromName", "getStartFromName()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "debugMode", "getDebugMode()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "verbose", "getVerbose()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "unitReturnType", "getUnitReturnType()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "withoutReturnType", "getWithoutReturnType()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "enhancedTypes", "getEnhancedTypes()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "receiverAfterName", "getReceiverAfterName()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0, c12232e), AbstractC10257e.billing(C17127e.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0, c12232e), AbstractC10257e.billing(C17127e.class, "informativeErrorType", "getInformativeErrorType()Z", 0, c12232e)};
    }

    public C17127e() {
        Boolean bool = Boolean.TRUE;
        this.metrica = new C1577e(bool, this, 2);
        this.license = new C1577e(bool, this, 2);
        this.appmetrica = new C1577e(EnumC7095e.f14554e, this, 2);
        Boolean bool2 = Boolean.FALSE;
        this.purchase = new C1577e(bool2, this, 2);
        this.billing = new C1577e(bool2, this, 2);
        this.yandex = new C1577e(bool2, this, 2);
        this.startapp = new C1577e(bool2, this, 2);
        this.adcel = new C1577e(bool2, this, 2);
        this.mopub = new C1577e(bool, this, 2);
        this.advert = new C1577e(bool2, this, 2);
        this.smaato = new C1577e(bool2, this, 2);
        this.amazon = new C1577e(bool2, this, 2);
        this.loadAd = new C1577e(bool, this, 2);
        this.Signature = new C1577e(bool, this, 2);
        this.admob = new C1577e(bool2, this, 2);
        this.subscription = new C1577e(bool2, this, 2);
        this.remoteconfig = new C1577e(bool2, this, 2);
        this.pro = new C1577e(bool2, this, 2);
        this.signatures = new C1577e(bool2, this, 2);
        this.tapsense = new C1577e(null, this, 2);
        this.isVip = new C1577e(bool2, this, 2);
        this.inmobi = new C1577e(bool2, this, 2);
        this.isPro = new C1577e(C7247e.f14816e, this, 2);
        this.applovin = new C1577e(C7247e.f14813e, this, 2);
        this.ads = new C1577e(bool, this, 2);
        this.premium = new C1577e(EnumC12498e.f25029e, this, 2);
        this.subs = new C1577e(C14663e.ad, this, 2);
        this.crashlytics = new C1577e(EnumC7201e.f14710e, this, 2);
        this.firebase = new C1577e(EnumC7280e.f14890e, this, 2);
        this.f33523class = new C1577e(bool2, this, 2);
        this.f33529interface = new C1577e(bool2, this, 2);
        this.f33527goto = new C1577e(EnumC1891e.f5034e, this, 2);
        this.f33534this = new C1577e(bool2, this, 2);
        this.f33530native = new C1577e(bool2, this, 2);
        this.f33525extends = new C1577e(C3295e.f7451e, this, 2);
        this.f33535throw = new C1577e(AbstractC8628e.ad, this, 2);
        this.f33537while = new C1577e(null, this, 2);
        this.f33536try = new C1577e(EnumC12673e.NO_ARGUMENTS, this, 2);
        this.f33532protected = new C1577e(bool2, this, 2);
        this.f33520break = new C1577e(bool, this, 2);
        this.f33519abstract = new C1577e(bool, this, 2);
        this.f33524default = new C1577e(bool2, this, 2);
        this.f33528implements = new C1577e(bool2, this, 2);
        this.f33521case = new C1577e(bool, this, 2);
        this.f33522catch = new C1577e(bool, this, 2);
        this.f33526final = new C1577e(bool2, this, 2);
        this.f33533super = new C1577e(bool2, this, 2);
        this.f33531new = new C1577e(bool, this, 2);
    }

    @Override // defpackage.InterfaceC11934e
    public final void ad() {
        this.f33523class.metrica(f33518strictfp[30], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC11934e
    public final void adcel() {
        this.metrica.metrica(f33518strictfp[1], Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC11934e
    public final void advert() {
        this.crashlytics.metrica(f33518strictfp[28], EnumC7201e.f14709e);
    }

    public final boolean amazon() {
        InterfaceC8614e interfaceC8614e = f33518strictfp[6];
        return ((Boolean) this.yandex.ad).booleanValue();
    }

    @Override // defpackage.InterfaceC11934e
    public final void appmetrica(LinkedHashSet linkedHashSet) {
        this.f33535throw.metrica(f33518strictfp[36], linkedHashSet);
    }

    @Override // defpackage.InterfaceC11934e
    public final void billing(InterfaceC3810e interfaceC3810e) {
        this.vip.metrica(f33518strictfp[0], interfaceC3810e);
    }

    @Override // defpackage.InterfaceC11934e
    public final void license(Set set) {
        this.appmetrica.metrica(f33518strictfp[3], set);
    }

    @Override // defpackage.InterfaceC11934e
    public final void metrica() {
        this.f33529interface.metrica(f33518strictfp[31], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC11934e
    public final Set mopub() {
        InterfaceC8614e interfaceC8614e = f33518strictfp[36];
        return (Set) this.f33535throw.ad;
    }

    @Override // defpackage.InterfaceC11934e
    public final void purchase() {
        this.isVip.metrica(f33518strictfp[21], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC11934e
    public final void smaato() {
        this.inmobi.metrica(f33518strictfp[22], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC11934e
    public final void startapp() {
        this.purchase.metrica(f33518strictfp[4], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC11934e
    public final void vip() {
        this.yandex.metrica(f33518strictfp[6], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC11934e
    public final void yandex(EnumC7280e enumC7280e) {
        this.firebase.metrica(f33518strictfp[29], enumC7280e);
    }
}
