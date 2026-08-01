package defpackage;

import android.util.Pair;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17669e implements InterfaceC11421e, InterfaceC15826e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7982e f34628e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8846e f34629e;

    public C17669e(C7982e c7982e, C8846e c8846e) {
        this.f34628e = c7982e;
        this.f34629e = c8846e;
    }

    @Override // defpackage.InterfaceC15826e
    public final void ad(int i, C18208e c18208e, Exception exc) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC9527e(2, this, vip, exc));
        }
    }

    @Override // defpackage.InterfaceC15826e
    public final void adcel(int i, C18208e c18208e, C8455e c8455e) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC9527e(1, this, vip, c8455e));
        }
    }

    @Override // defpackage.InterfaceC15826e
    public final void advert(int i, C18208e c18208e, int i2) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC16764e(this, vip, i2, 7));
        }
    }

    @Override // defpackage.InterfaceC15826e
    public final void applovin(int i, C18208e c18208e) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC10236e(this, vip, 1));
        }
    }

    @Override // defpackage.InterfaceC11421e
    public final void billing(int i, C18208e c18208e, C0807e c0807e) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC15604e(this, vip, c0807e, 1));
        }
    }

    @Override // defpackage.InterfaceC11421e
    /* renamed from: catch */
    public final void mo1483catch(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e, int i2) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC11063e(this, vip, c6913e, c0807e, i2, 2));
        }
    }

    @Override // defpackage.InterfaceC11421e
    public final void inmobi(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e, IOException iOException, boolean z) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC16478e(this, vip, c6913e, c0807e, iOException, z, 0));
        }
    }

    @Override // defpackage.InterfaceC15826e
    /* renamed from: protected */
    public final void mo1496protected(int i, C18208e c18208e) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC10236e(this, vip, 0));
        }
    }

    @Override // defpackage.InterfaceC11421e
    public final void remoteconfig(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC3597e(this, vip, c6913e, c0807e, 0));
        }
    }

    @Override // defpackage.InterfaceC11421e
    public final void tapsense(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC3597e(this, vip, c6913e, c0807e, 1));
        }
    }

    public final Pair vip(int i, C18208e c18208e) {
        C18208e c18208e2;
        C8846e c8846e = this.f34629e;
        C18208e c18208e3 = null;
        if (c18208e != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= c8846e.metrica.size()) {
                    c18208e2 = null;
                    break;
                }
                if (((C18208e) c8846e.metrica.get(i2)).license == c18208e.license) {
                    Object obj = c18208e.ad;
                    Object obj2 = c8846e.vip;
                    int i3 = C9189e.amazon;
                    c18208e2 = c18208e.ad(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (c18208e2 == null) {
                return null;
            }
            c18208e3 = c18208e2;
        }
        return Pair.create(Integer.valueOf(i + c8846e.license), c18208e3);
    }

    @Override // defpackage.InterfaceC11421e
    public final void yandex(int i, C18208e c18208e, C0807e c0807e) {
        Pair vip = vip(i, c18208e);
        if (vip != null) {
            ((C2399e) this.f34628e.adcel).license(new RunnableC15604e(this, vip, c0807e, 0));
        }
    }
}
