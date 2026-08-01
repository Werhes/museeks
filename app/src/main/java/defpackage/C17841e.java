package defpackage;

import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17841e {
    public static final C17841e metrica = new C17841e(C4236e.vip, C13131e.premium());
    public final C4236e ad;
    public final C13131e vip;

    public C17841e(C4236e c4236e, C13131e c13131e) {
        c4236e.getClass();
        this.ad = c4236e;
        this.vip = c13131e;
    }

    public static C17841e ad(AbstractC3513e abstractC3513e, boolean z) {
        C4236e ad;
        int mo650transient = abstractC3513e.mo650transient();
        if (mo650transient > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(mo650transient).length() + 44);
            sb.append("Unsupported version: ");
            sb.append(mo650transient);
            sb.append(". Current version is: 1");
            throw new IOException(sb.toString());
        }
        abstractC3513e.mo650transient();
        int applovin = abstractC3513e.applovin(abstractC3513e.mo639private());
        C17268e c17268e = C17268e.ad;
        int i = AbstractC3433e.ad;
        C13131e ads = C13131e.ads(abstractC3513e, C17268e.vip);
        abstractC3513e.ads(applovin);
        C4734e c4734e = new C4734e();
        Inflater inflater = (Inflater) c4734e.f10118e;
        try {
            if (!z) {
                inflater.setInput(abstractC3513e.mo644strictfp());
                try {
                    ad = C4236e.ad(AbstractC3513e.m1366interface(new C7404e(5, c4734e), 4096));
                    c4734e.close();
                    return new C17841e(ad, ads);
                } finally {
                }
            }
            int applovin2 = abstractC3513e.applovin(abstractC3513e.mo639private());
            int premium = abstractC3513e.premium();
            try {
                ad = C4236e.ad(AbstractC3513e.m1366interface(new InflaterInputStream(new C7404e(c4734e, abstractC3513e), inflater, premium < 0 ? 4096 : Math.min(premium, 4096)), 4096));
                inflater.reset();
                if (abstractC3513e.premium() != 0) {
                    throw new IOException("Unexpected bytes remaining after FlagsBlob parsing.");
                }
                abstractC3513e.ads(applovin2);
                c4734e.close();
                return new C17841e(ad, ads);
            } finally {
            }
        } finally {
            try {
                c4734e.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }
}
