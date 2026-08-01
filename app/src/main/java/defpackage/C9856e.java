package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9856e implements InterfaceC5562e {
    public final int vip;

    public C9856e(int i) {
        this.vip = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // defpackage.InterfaceC5562e
    public final InterfaceC5169e ad(InterfaceC4719e interfaceC4719e, InterfaceC17873e interfaceC17873e) {
        if ((interfaceC17873e instanceof C16455e) && ((C16455e) interfaceC17873e).metrica != 1) {
            return new C6093e(interfaceC4719e, interfaceC17873e, this.vip);
        }
        return new C13282e(interfaceC4719e, interfaceC17873e);
    }
}
