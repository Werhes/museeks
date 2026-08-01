package defpackage;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: eْۛۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13513e implements AlgorithmParameterSpec {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Ctry f26805e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Ctry f26806e;

    public C13513e(String str) {
        this(AbstractC7899e.purchase(str), str.indexOf("12-512") > 0 ? InterfaceC13429e.vip : str.indexOf("12-256") > 0 ? InterfaceC13429e.ad : InterfaceC6859e.loadAd);
    }

    public C13513e(Ctry ctry, Ctry ctry2) {
        this.f26806e = ctry;
        this.f26805e = ctry2;
    }
}
