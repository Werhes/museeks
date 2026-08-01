package defpackage;

/* renamed from: eَؗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4786e extends AbstractC10369e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final byte[] f10210e = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public C4786e() {
        super(f10210e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4786e(C4786e c4786e) {
        super(f10210e);
        c4786e.getClass();
        vip(c4786e);
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C4786e(this);
    }

    @Override // defpackage.AbstractC10369e, defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[64];
        super.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i, 32);
        return 32;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "GOST3411-2012-256";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 32;
    }
}
