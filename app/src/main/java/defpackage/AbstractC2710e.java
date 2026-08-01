package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2710e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f6586e = -1;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f6587e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9790e f6588e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC2994e f6589e;

    public AbstractC2710e(AbstractC9790e abstractC9790e, InterfaceC2994e interfaceC2994e) {
        this.f6588e = abstractC9790e;
        this.f6589e = interfaceC2994e;
    }

    public final void ad(boolean z) {
        if (z == this.f6587e) {
            return;
        }
        this.f6587e = z;
        int i = z ? 1 : -1;
        AbstractC9790e abstractC9790e = this.f6588e;
        int i2 = abstractC9790e.metrica;
        abstractC9790e.metrica = i + i2;
        if (!abstractC9790e.license) {
            abstractC9790e.license = true;
            while (true) {
                try {
                    int i3 = abstractC9790e.metrica;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        abstractC9790e.purchase();
                    } else if (z3) {
                        abstractC9790e.billing();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    abstractC9790e.license = false;
                    throw th;
                }
            }
            abstractC9790e.license = false;
        }
        if (this.f6587e) {
            abstractC9790e.metrica(this);
        }
    }

    public abstract boolean metrica();

    public void vip() {
    }
}
