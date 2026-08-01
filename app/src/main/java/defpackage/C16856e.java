package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16856e extends AbstractC9832e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33029e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C6467e f33030e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC11221e f33031e;

    public /* synthetic */ C16856e(C6467e c6467e, InterfaceC11221e interfaceC11221e, int i) {
        this.f33029e = i;
        this.f33030e = c6467e;
        this.f33031e = interfaceC11221e;
    }

    @Override // defpackage.AbstractC9832e
    public final void mopub(Throwable th) {
        switch (this.f33029e) {
            case 0:
                C6467e c6467e = this.f33030e;
                c6467e.getClass();
                Object obj = C6467e.f13374e.get(c6467e);
                if (!(obj instanceof C1427e)) {
                    obj = AbstractC15211e.startapp(obj);
                }
                ((C16259e) this.f33031e).yandex(c6467e, obj);
                return;
            default:
                ((C16259e) this.f33031e).yandex(this.f33030e, Unit.INSTANCE);
                return;
        }
    }

    @Override // defpackage.AbstractC9832e
    public final boolean startapp() {
        switch (this.f33029e) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
