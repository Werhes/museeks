package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1519e implements InterfaceC12504e, InterfaceC7449e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f4394e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4395e;

    public /* synthetic */ C1519e(int i, C1410e c1410e) {
        this.f4395e = i;
        this.f4394e = c1410e;
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        ((InterfaceC8524e) obj).mo1503while(this.f4394e);
    }

    @Override // defpackage.InterfaceC7449e
    public Object startapp(C6584e c6584e, C18424e c18424e, int i) {
        switch (this.f4395e) {
            case 1:
                return c6584e.subscription(c18424e, this.f4394e);
            default:
                return c6584e.subscription(c18424e, this.f4394e);
        }
    }
}
