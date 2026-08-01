package defpackage;

/* renamed from: eًؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3224e extends AbstractC10369e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final byte[] f7351e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public C3224e() {
        super(f7351e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3224e(C3224e c3224e) {
        super(f7351e);
        c3224e.getClass();
        vip(c3224e);
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C3224e(this);
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "GOST3411-2012-512";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 64;
    }
}
