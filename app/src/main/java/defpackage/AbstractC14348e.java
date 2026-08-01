package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۤؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14348e {
    public static final C12816e Signature;
    public static final C12816e ad;
    public static final Set adcel;
    public static final Set advert;
    public static final Set amazon;
    public static final C12816e appmetrica;
    public static final C12816e billing;
    public static final C12816e license;
    public static final Set loadAd;
    public static final C12816e metrica;
    public static final Set mopub;
    public static final C12816e purchase;
    public static final Set smaato;
    public static final C12816e startapp;
    public static final C12816e vip;
    public static final C12816e yandex;

    static {
        C12816e c12816e = new C12816e("org.jspecify.nullness.Nullable");
        C12816e c12816e2 = new C12816e("org.jspecify.nullness.NullMarked");
        ad = c12816e2;
        C12816e c12816e3 = new C12816e("org.jspecify.nullness.NullnessUnspecified");
        C12816e c12816e4 = new C12816e("org.jspecify.annotations.NonNull");
        C12816e c12816e5 = new C12816e("org.jspecify.annotations.Nullable");
        C12816e c12816e6 = new C12816e("org.jspecify.annotations.NullMarked");
        vip = c12816e6;
        C12816e c12816e7 = new C12816e("org.jspecify.annotations.NullnessUnspecified");
        C12816e c12816e8 = new C12816e("org.jspecify.annotations.NullUnmarked");
        metrica = c12816e8;
        license = new C12816e("javax.annotation.meta.TypeQualifier");
        appmetrica = new C12816e("javax.annotation.meta.TypeQualifierNickname");
        purchase = new C12816e("javax.annotation.meta.TypeQualifierDefault");
        C12816e c12816e9 = new C12816e("javax.annotation.Nonnull");
        billing = c12816e9;
        C12816e c12816e10 = new C12816e("javax.annotation.Nullable");
        C12816e c12816e11 = new C12816e("javax.annotation.CheckForNull");
        yandex = new C12816e("javax.annotation.ParametersAreNonnullByDefault");
        startapp = new C12816e("javax.annotation.ParametersAreNullableByDefault");
        adcel = AbstractC1660e.m664case(new C12816e[]{c12816e9, c12816e11});
        Set m664case = AbstractC1660e.m664case(new C12816e[]{AbstractC15262e.yandex, c12816e4, new C12816e("android.annotation.NonNull"), new C12816e("androidx.annotation.NonNull"), new C12816e("androidx.annotation.RecentlyNonNull"), new C12816e("android.support.annotation.NonNull"), new C12816e("com.android.annotations.NonNull"), new C12816e("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new C12816e("org.checkerframework.checker.nullness.qual.NonNull"), new C12816e("edu.umd.cs.findbugs.annotations.NonNull"), new C12816e("io.reactivex.annotations.NonNull"), new C12816e("io.reactivex.rxjava3.annotations.NonNull"), new C12816e("org.eclipse.jdt.annotation.NonNull"), new C12816e("lombok.NonNull"), new C12816e("jakarta.annotation.Nonnull")});
        mopub = m664case;
        Set m664case2 = AbstractC1660e.m664case(new C12816e[]{AbstractC15262e.startapp, c12816e, c12816e5, c12816e10, c12816e11, new C12816e("android.annotation.Nullable"), new C12816e("androidx.annotation.Nullable"), new C12816e("androidx.annotation.RecentlyNullable"), new C12816e("android.support.annotation.Nullable"), new C12816e("com.android.annotations.Nullable"), new C12816e("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new C12816e("org.checkerframework.checker.nullness.qual.Nullable"), new C12816e("edu.umd.cs.findbugs.annotations.Nullable"), new C12816e("edu.umd.cs.findbugs.annotations.PossiblyNull"), new C12816e("edu.umd.cs.findbugs.annotations.CheckForNull"), new C12816e("io.reactivex.annotations.Nullable"), new C12816e("io.reactivex.rxjava3.annotations.Nullable"), new C12816e("org.eclipse.jdt.annotation.Nullable"), new C12816e("jakarta.annotation.Nullable")});
        advert = m664case2;
        smaato = AbstractC1660e.m664case(new C12816e[]{c12816e3, c12816e7});
        AbstractC4511e.Signature(AbstractC4511e.Signature(AbstractC4511e.Signature(AbstractC4511e.Signature(AbstractC4511e.loadAd(AbstractC4511e.loadAd(new LinkedHashSet(), m664case), m664case2), c12816e9), c12816e2), c12816e6), c12816e8);
        amazon = AbstractC1660e.m664case(new C12816e[]{AbstractC15262e.mopub, AbstractC15262e.advert});
        loadAd = AbstractC1660e.m664case(new C12816e[]{AbstractC15262e.adcel, AbstractC15262e.smaato});
        AbstractC10064e.purchase(new C6571e(AbstractC15262e.metrica, AbstractC0206e.pro), new C6571e(AbstractC15262e.license, AbstractC0206e.isVip), new C6571e(AbstractC15262e.appmetrica, AbstractC0206e.smaato), new C6571e(AbstractC15262e.purchase, AbstractC0206e.inmobi));
        Signature = new C12816e("kotlin.annotations.jvm.UnderMigration");
    }
}
