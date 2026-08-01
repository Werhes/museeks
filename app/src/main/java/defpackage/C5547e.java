package defpackage;

import java.io.IOException;

/* renamed from: eٍؘ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5547e extends Cextends implements premium {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f11877e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public subs f11878e;

    public C5547e(int i, Cextends cextends) {
        this.f11878e = cextends;
        this.f11877e = i;
    }

    public C5547e(C15466e c15466e) {
        this.f11878e = c15466e;
        this.f11877e = 4;
    }

    public static C5547e loadAd(Object obj) {
        Ctry ctry;
        if (obj == null || (obj instanceof C5547e)) {
            return (C5547e) obj;
        }
        if (!(obj instanceof Cstrictfp)) {
            if (!(obj instanceof byte[])) {
                throw new IllegalArgumentException("unknown object in getInstance: ".concat(obj.getClass().getName()));
            }
            try {
                return loadAd(Cdefault.inmobi((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        }
        Cstrictfp cstrictfp = (Cstrictfp) obj;
        int i = cstrictfp.f36462e;
        inmobi inmobiVar = Ccatch.f640e;
        switch (i) {
            case 0:
            case 3:
            case 5:
                AbstractC9947e.ad(cstrictfp);
                Cdefault crashlytics = cstrictfp.crashlytics(false, inmobiVar);
                inmobiVar.m4630e(crashlytics);
                return new C5547e(i, (Ccatch) crashlytics);
            case 1:
            case 2:
            case 6:
                AbstractC9947e.ad(cstrictfp);
                inmobi inmobiVar2 = C10911e.f21613e;
                Cdefault crashlytics2 = cstrictfp.crashlytics(false, inmobiVar2);
                inmobiVar2.m4630e(crashlytics2);
                return new C5547e(i, (C10911e) crashlytics2);
            case 4:
                C12553e c12553e = C15466e.f30554e;
                return new C5547e(i, C15466e.Signature((Ccatch) inmobiVar.m4616e(cstrictfp, true)));
            case 7:
                AbstractC9947e.ad(cstrictfp);
                inmobi inmobiVar3 = Cprotected.f36448e;
                Cdefault crashlytics3 = cstrictfp.crashlytics(false, inmobiVar3);
                inmobiVar3.m4630e(crashlytics3);
                return new C5547e(i, (Cprotected) crashlytics3);
            case 8:
                inmobi inmobiVar4 = Ctry.f36488e;
                int i2 = cstrictfp.f36465e;
                if (i2 != 3 && i2 != 4 && cstrictfp.f36463e == 128) {
                    subs subsVar = cstrictfp.f36464e;
                    Cdefault billing = (subsVar instanceof Cextends ? (Cextends) subsVar : subsVar.billing()).billing();
                    if (!(billing instanceof Ctry)) {
                        byte[] bArr = Cprotected.subs(billing).f36449e;
                        if (bArr == null) {
                            throw new NullPointerException("'contents' cannot be null");
                        }
                        ctry = Ctry.firebase(true, bArr);
                        return new C5547e(i, ctry);
                    }
                }
                inmobi inmobiVar5 = Ctry.f36488e;
                AbstractC9947e.ad(cstrictfp);
                Cdefault crashlytics4 = cstrictfp.crashlytics(false, inmobiVar5);
                inmobiVar5.m4630e(crashlytics4);
                ctry = (Ctry) crashlytics4;
                return new C5547e(i, ctry);
            default:
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "unknown tag: "));
        }
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        int i = this.f11877e;
        return new Cstrictfp(i == 4, i, this.f11878e);
    }

    public final String toString() {
        String ad;
        subs subsVar = this.f11878e;
        StringBuilder sb = new StringBuilder();
        int i = this.f11877e;
        sb.append(i);
        sb.append(": ");
        if (i != 1 && i != 2) {
            if (i == 4) {
                C15466e Signature = C15466e.Signature(subsVar);
                ad = Signature.f30556e.ad(Signature);
                sb.append(ad);
                return sb.toString();
            }
            if (i != 6) {
                sb.append(subsVar.toString());
                return sb.toString();
            }
        }
        ad = AbstractC1433e.ad(C10911e.subs(subsVar).f21614e);
        sb.append(ad);
        return sb.toString();
    }
}
