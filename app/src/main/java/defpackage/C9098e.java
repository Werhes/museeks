package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۤۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9098e extends AbstractC9832e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f18226e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f18227e;

    public /* synthetic */ C9098e(int i, Object obj) {
        this.f18226e = i;
        this.f18227e = obj;
    }

    @Override // defpackage.AbstractC9832e
    public final void mopub(Throwable th) {
        switch (this.f18226e) {
            case 0:
                ((InterfaceC1232e) this.f18227e).ad();
                return;
            case 1:
                ((Function1) this.f18227e).invoke(th);
                return;
            default:
                C11285e c11285e = (C11285e) this.f18227e;
                C6467e c6467e = this.f19423e;
                if (c6467e == null) {
                    c6467e = null;
                }
                c6467e.getClass();
                Object obj = C6467e.f13374e.get(c6467e);
                if (obj instanceof C1427e) {
                    c11285e.billing(new C12763e(((C1427e) obj).ad));
                    return;
                } else {
                    c11285e.billing(AbstractC15211e.startapp(obj));
                    return;
                }
        }
    }

    @Override // defpackage.AbstractC9832e
    public final boolean startapp() {
        switch (this.f18226e) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }
}
