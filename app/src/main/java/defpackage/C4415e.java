package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ۠ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4415e implements InterfaceC5083e, InterfaceC18430e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16428e f9586e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f9587e = RecyclerView.UNDEFINED_DURATION;

    public C4415e(C16428e c16428e) {
        this.f9586e = c16428e;
    }

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        C16428e c16428e = this.f9586e;
        InterfaceC5083e[] interfaceC5083eArr = c16428e.f32254e;
        int i = c16428e.f32259e;
        InterfaceC5083e interfaceC5083e = interfaceC5083eArr[i];
        if (interfaceC5083e != this && interfaceC5083e != null) {
            return interfaceC5083e.admob();
        }
        int i2 = i - 1;
        while (i2 >= 0) {
            int i3 = i2 - 1;
            InterfaceC5083e interfaceC5083e2 = interfaceC5083eArr[i2];
            if (interfaceC5083e2 != this && interfaceC5083e2 != null) {
                return interfaceC5083e2.admob();
            }
            i2 = i3;
        }
        throw new IllegalStateException("Not started");
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        boolean z = obj instanceof C12763e;
        C16428e c16428e = this.f9586e;
        if (z) {
            c16428e.startapp(new C12763e(C13523e.ad(obj)));
        } else {
            c16428e.yandex(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [eًؗۖ[]] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // defpackage.InterfaceC18430e
    public final InterfaceC18430e vip() {
        C2985e c2985e = C2985e.f7026e;
        int i = this.f9587e;
        C16428e c16428e = this.f9586e;
        if (i == Integer.MIN_VALUE) {
            this.f9587e = c16428e.f32259e;
        }
        int i2 = this.f9587e;
        if (i2 < 0) {
            this.f9587e = RecyclerView.UNDEFINED_DURATION;
            c2985e = null;
        } else {
            try {
                ?? r2 = c16428e.f32254e[i2];
                if (r2 != 0) {
                    this.f9587e = i2 - 1;
                    c2985e = r2;
                }
            } catch (Throwable unused) {
            }
        }
        if (c2985e instanceof InterfaceC18430e) {
            return c2985e;
        }
        return null;
    }
}
