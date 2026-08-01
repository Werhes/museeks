package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13988e implements InterfaceC7898e, InterfaceC9307e, InterfaceC6786e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f27704e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0560e f27705e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f27706e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f27707e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f27708e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f27709e = new Object();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Exception f27710e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f27711e;

    public C13988e(int i, C0560e c0560e) {
        this.f27706e = i;
        this.f27705e = c0560e;
    }

    public final void ad() {
        int i = this.f27708e + this.f27704e + this.f27711e;
        int i2 = this.f27706e;
        if (i == i2) {
            Exception exc = this.f27710e;
            C0560e c0560e = this.f27705e;
            if (exc == null) {
                if (this.f27707e) {
                    c0560e.admob();
                    return;
                } else {
                    c0560e.amazon(null);
                    return;
                }
            }
            int i3 = this.f27704e;
            int length = String.valueOf(i3).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + length + 8 + 24);
            sb.append(i3);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            c0560e.Signature(new ExecutionException(sb.toString(), this.f27710e));
        }
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public final void mo268e(Exception exc) {
        synchronized (this.f27709e) {
            this.f27704e++;
            this.f27710e = exc;
            ad();
        }
    }

    @Override // defpackage.InterfaceC7898e
    public final void license(Object obj) {
        synchronized (this.f27709e) {
            this.f27708e++;
            ad();
        }
    }

    @Override // defpackage.InterfaceC6786e
    public final void subscription() {
        synchronized (this.f27709e) {
            this.f27711e++;
            this.f27707e = true;
            ad();
        }
    }
}
