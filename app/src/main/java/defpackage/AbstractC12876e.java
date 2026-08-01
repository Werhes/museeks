package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12876e {
    public static final C13507e ad;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final C10221e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        ad = new C13507e(C13993e.class, new C0189e(24));
        vip = new C10221e(metrica2, new C0189e(25));
        metrica = new C13780e(C12929e.class, new C0189e(26));
        license = new C17594e(metrica2, new C0189e(27));
    }

    public static C13993e ad(C6247e c6247e, EnumC3021e enumC3021e) {
        C17089e c17089e;
        C6140e c6140e;
        C2455e m2323interface = C7818e.m2323interface();
        m2323interface.yandex(c6247e.subs().firebase());
        m2323interface.startapp(c6247e.subs().m2325class());
        m2323interface.billing(EnumC3021e.RAW);
        AbstractC12699e license2 = AbstractC15268e.license(((C7818e) m2323interface.ad()).appmetrica());
        boolean z = license2 instanceof C15694e;
        Object obj = C17089e.f33444e;
        C17089e c17089e2 = C17089e.f33446e;
        C17089e c17089e3 = C17089e.f33447e;
        C17089e c17089e4 = C17089e.f33445e;
        C17089e c17089e5 = C17089e.f33442e;
        C17089e c17089e6 = C17089e.f33443e;
        if (z) {
            c17089e = c17089e6;
        } else if (license2 instanceof C11488e) {
            c17089e = c17089e5;
        } else if (license2 instanceof C0631e) {
            c17089e = c17089e4;
        } else if (license2 instanceof C11897e) {
            c17089e = c17089e3;
        } else if (license2 instanceof C9325e) {
            c17089e = c17089e2;
        } else {
            if (!(license2 instanceof C2428e)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + license2);
            }
            c17089e = obj;
        }
        int ordinal = enumC3021e.ordinal();
        if (ordinal == 1) {
            c6140e = C6140e.f12910e;
        } else {
            if (ordinal != 3) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3021e.vip());
            }
            c6140e = C6140e.f12911e;
        }
        String crashlytics = c6247e.crashlytics();
        AbstractC10947e abstractC10947e = (AbstractC10947e) license2;
        if (crashlytics == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (abstractC10947e == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC10947e.ad()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((c17089e.equals(c17089e6) && (abstractC10947e instanceof C15694e)) || ((c17089e.equals(c17089e5) && (abstractC10947e instanceof C11488e)) || ((c17089e.equals(c17089e4) && (abstractC10947e instanceof C0631e)) || ((c17089e.equals(c17089e3) && (abstractC10947e instanceof C11897e)) || ((c17089e.equals(c17089e2) && (abstractC10947e instanceof C9325e)) || (c17089e.equals(obj) && (abstractC10947e instanceof C2428e))))))) {
            return new C13993e(c6140e, crashlytics, c17089e, abstractC10947e);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + c17089e.f33448e + " when new keys are picked according to " + abstractC10947e + ".");
    }

    public static EnumC3021e metrica(C6140e c6140e) {
        if (C6140e.f12910e.equals(c6140e)) {
            return EnumC3021e.TINK;
        }
        if (C6140e.f12911e.equals(c6140e)) {
            return EnumC3021e.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c6140e);
    }

    public static C6247e vip(C13993e c13993e) {
        try {
            C7818e m2324this = C7818e.m2324this(AbstractC15268e.billing(c13993e.license), C5712e.ad());
            C6009e firebase = C6247e.firebase();
            String str = c13993e.vip;
            firebase.appmetrica();
            C6247e.applovin((C6247e) firebase.f9709e, str);
            firebase.appmetrica();
            C6247e.ads((C6247e) firebase.f9709e, m2324this);
            return (C6247e) firebase.ad();
        } catch (C8868e e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }
}
