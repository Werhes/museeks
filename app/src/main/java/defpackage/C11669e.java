package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11669e implements InterfaceC16970e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f23453e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f23454e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f23455e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f23456e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f23457e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C10919e[] f23458e;

    public C11669e(int i) {
        AbstractC2301e.billing(i > 0);
        this.f23457e = true;
        this.f23455e = i;
        this.f23453e = 0;
        this.f23458e = new C10919e[100];
    }

    @Override // defpackage.InterfaceC16970e
    public final synchronized C10919e Signature() {
        C10919e c10919e;
        try {
            int i = this.f23456e + 1;
            this.f23456e = i;
            int i2 = this.f23453e;
            if (i2 > 0) {
                C10919e[] c10919eArr = this.f23458e;
                int i3 = i2 - 1;
                this.f23453e = i3;
                c10919e = c10919eArr[i3];
                c10919e.getClass();
                this.f23458e[this.f23453e] = null;
            } else {
                C10919e c10919e2 = new C10919e(0, new byte[this.f23455e]);
                C10919e[] c10919eArr2 = this.f23458e;
                if (i > c10919eArr2.length) {
                    this.f23458e = (C10919e[]) Arrays.copyOf(c10919eArr2, c10919eArr2.length * 2);
                }
                c10919e = c10919e2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c10919e;
    }

    public final synchronized void ad(int i) {
        boolean z = i < this.f23454e;
        this.f23454e = i;
        if (z) {
            admob();
        }
    }

    @Override // defpackage.InterfaceC16970e
    public final synchronized void admob() {
        int max = Math.max(0, AbstractC9413e.billing(this.f23454e, this.f23455e) - this.f23456e);
        int i = this.f23453e;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.f23458e, max, i, (Object) null);
        this.f23453e = max;
    }

    @Override // defpackage.InterfaceC16970e
    public final synchronized void appmetrica(C18524e c18524e) {
        while (c18524e != null) {
            C10919e[] c10919eArr = this.f23458e;
            int i = this.f23453e;
            this.f23453e = i + 1;
            C10919e c10919e = (C10919e) c18524e.f36317e;
            c10919e.getClass();
            c10919eArr[i] = c10919e;
            this.f23456e--;
            c18524e = (C18524e) c18524e.f36316e;
            if (c18524e == null || ((C10919e) c18524e.f36317e) == null) {
                c18524e = null;
            }
        }
    }

    @Override // defpackage.InterfaceC16970e
    public final synchronized void loadAd(C10919e c10919e) {
        C10919e[] c10919eArr = this.f23458e;
        int i = this.f23453e;
        this.f23453e = i + 1;
        c10919eArr[i] = c10919e;
        this.f23456e--;
    }

    @Override // defpackage.InterfaceC16970e
    public final int pro() {
        return this.f23455e;
    }
}
