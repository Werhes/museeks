package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۢۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12831e implements InterfaceC7445e {
    public final /* synthetic */ int ad;
    public final InterfaceC14209e appmetrica;
    public C7369e license;
    public boolean vip = false;
    public boolean metrica = false;

    public /* synthetic */ C12831e(InterfaceC14209e interfaceC14209e, int i) {
        this.ad = i;
        this.appmetrica = interfaceC14209e;
    }

    @Override // defpackage.InterfaceC7445e
    public final InterfaceC7445e metrica(boolean z) {
        switch (this.ad) {
            case 0:
                if (this.vip) {
                    throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.vip = true;
                ((C12426e) this.appmetrica).metrica(this.license, z ? 1 : 0, this.metrica);
                return this;
            case 1:
                if (this.vip) {
                    throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.vip = true;
                ((C2917e) this.appmetrica).yandex(this.license, z ? 1 : 0, this.metrica);
                return this;
            default:
                if (this.vip) {
                    throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.vip = true;
                ((C14047e) this.appmetrica).yandex(this.license, z ? 1 : 0, this.metrica);
                return this;
        }
    }

    @Override // defpackage.InterfaceC7445e
    public final InterfaceC7445e vip(String str) {
        switch (this.ad) {
            case 0:
                if (this.vip) {
                    throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.vip = true;
                ((C12426e) this.appmetrica).yandex(this.license, str, this.metrica);
                return this;
            case 1:
                if (this.vip) {
                    throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.vip = true;
                ((C2917e) this.appmetrica).metrica(this.license, str, this.metrica);
                return this;
            default:
                if (this.vip) {
                    throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.vip = true;
                ((C14047e) this.appmetrica).metrica(this.license, str, this.metrica);
                return this;
        }
    }
}
