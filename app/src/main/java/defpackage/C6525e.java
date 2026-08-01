package defpackage;

import java.io.IOException;

/* renamed from: eؙٝؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6525e implements subs, InterfaceC5145e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Csuper f13444e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13445e;

    public /* synthetic */ C6525e(int i) {
        this.f13445e = i;
    }

    public C6525e(Csuper csuper) {
        this.f13445e = 2;
        this.f13444e = csuper;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [catch, eؚؖٚ] */
    public static C4148e ad(Csuper csuper) {
        try {
            ?? ccatch = new Ccatch(csuper.m4654super());
            ccatch.f14196e = -1;
            return new C4148e(ccatch, 1);
        } catch (IllegalArgumentException e) {
            throw new Cclass(e.getMessage(), e, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [default, final, eؚؕٓ] */
    @Override // defpackage.InterfaceC5145e
    public final Cdefault advert() {
        switch (this.f13445e) {
            case 0:
                return new Ccatch(this.f13444e.m4654super());
            case 1:
                return new Cfinal(this.f13444e.m4654super(), false);
            case 2:
                return ad(this.f13444e);
            case 3:
                return AbstractC5023e.ad(this.f13444e.m4654super());
            default:
                crashlytics m4654super = this.f13444e.m4654super();
                C6935e c6935e = AbstractC5023e.ad;
                if (m4654super.f1117e < 1) {
                    return AbstractC5023e.vip;
                }
                ?? cfinal = new Cfinal(m4654super, false);
                cfinal.f7323e = -1;
                return cfinal;
        }
    }

    @Override // defpackage.subs
    public final Cdefault billing() {
        switch (this.f13445e) {
            case 0:
                try {
                    return new Ccatch(this.f13444e.m4654super());
                } catch (IOException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            case 1:
                try {
                    return new Cfinal(this.f13444e.m4654super(), false);
                } catch (IOException e2) {
                    throw new Cabstract(e2.getMessage(), e2, 0);
                }
            case 2:
                try {
                    return ad(this.f13444e);
                } catch (IOException e3) {
                    throw new Cabstract("unable to get DER object", e3, 0);
                } catch (IllegalArgumentException e4) {
                    throw new Cabstract("unable to get DER object", e4, 0);
                }
            case 3:
                try {
                    return advert();
                } catch (IOException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            default:
                try {
                    return advert();
                } catch (IOException e6) {
                    throw new Cabstract(e6.getMessage(), e6, 0);
                }
        }
    }
}
