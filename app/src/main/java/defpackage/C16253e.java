package defpackage;

/* renamed from: eٖٖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16253e extends C5338e implements InterfaceC6931e, InterfaceC7559e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16253e(int i) {
        super(i, EnumC0300e.f2305e);
        advert(i);
    }

    public static void advert(int i) {
        if (i != 128 && i != 256) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("'bitStrength' ", i, " not supported for SHAKE"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘؐٔ, eٌؑۛ] */
    public InterfaceC0554e ad() {
        return new C5338e(this);
    }

    @Override // defpackage.C5338e, defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        return metrica(i, this.f11447e / 4, bArr);
    }

    @Override // defpackage.C5338e, defpackage.InterfaceC0293e
    public String getAlgorithmName() {
        return "SHAKE" + this.f11447e;
    }

    @Override // defpackage.C5338e, defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return this.f11447e / 4;
    }

    @Override // defpackage.InterfaceC6931e
    public final int metrica(int i, int i2, byte[] bArr) {
        int smaato = smaato(i, i2, bArr);
        reset();
        return smaato;
    }

    public int smaato(int i, int i2, byte[] bArr) {
        if (!this.f11446e) {
            billing(15, 4);
        }
        mopub(i, i2 * 8, bArr);
        return i2;
    }

    @Override // defpackage.C5338e
    public final InterfaceC1436e startapp() {
        return new C11278e(getAlgorithmName(), 2);
    }

    public void vip(InterfaceC0554e interfaceC0554e) {
        yandex((C16253e) interfaceC0554e);
    }
}
