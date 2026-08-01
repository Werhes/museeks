package defpackage;

/* renamed from: eٌٍۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9147e extends C5338e implements InterfaceC7559e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9147e(int i) {
        super(i, EnumC0300e.f2305e);
        advert(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9147e(int i, int i2) {
        super(i, EnumC0300e.f2306e);
        advert(i);
    }

    public static void advert(int i) {
        if (i != 224 && i != 256 && i != 384 && i != 512) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("'bitLength' ", i, " not supported for SHA-3"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘؐٔ, eٌؑۛ] */
    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C5338e(this);
    }

    @Override // defpackage.C5338e, defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        billing(2, 2);
        return super.doFinal(bArr, i);
    }

    @Override // defpackage.C5338e, defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "SHA3-" + this.f11447e;
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        yandex((C9147e) interfaceC0554e);
    }
}
