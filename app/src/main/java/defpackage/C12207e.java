package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12207e extends AbstractC10986e {
    public final /* synthetic */ int vip = 0;

    public C12207e(byte b) {
        super(Byte.valueOf(b));
    }

    public C12207e(int i) {
        super(Integer.valueOf(i));
    }

    public C12207e(long j) {
        super(Long.valueOf(j));
    }

    public C12207e(short s) {
        super(Short.valueOf(s));
    }

    @Override // defpackage.AbstractC13656e
    public final AbstractC1186e ad(InterfaceC5334e interfaceC5334e) {
        AbstractC10226e mo1458e;
        AbstractC10226e mo1458e2;
        AbstractC10226e mo1458e3;
        AbstractC10226e mo1458e4;
        switch (this.vip) {
            case 0:
                InterfaceC5052e license = AbstractC1284e.license(interfaceC5334e, AbstractC0206e.f1438implements);
                return (license == null || (mo1458e = license.mo1458e()) == null) ? C18139e.vip(EnumC16799e.f32919e, "UByte") : mo1458e;
            case 1:
                InterfaceC5052e license2 = AbstractC1284e.license(interfaceC5334e, AbstractC0206e.f1432catch);
                return (license2 == null || (mo1458e2 = license2.mo1458e()) == null) ? C18139e.vip(EnumC16799e.f32919e, "UInt") : mo1458e2;
            case 2:
                InterfaceC5052e license3 = AbstractC1284e.license(interfaceC5334e, AbstractC0206e.f1436final);
                return (license3 == null || (mo1458e3 = license3.mo1458e()) == null) ? C18139e.vip(EnumC16799e.f32919e, "ULong") : mo1458e3;
            default:
                InterfaceC5052e license4 = AbstractC1284e.license(interfaceC5334e, AbstractC0206e.f1431case);
                return (license4 == null || (mo1458e4 = license4.mo1458e()) == null) ? C18139e.vip(EnumC16799e.f32919e, "UShort") : mo1458e4;
        }
    }

    @Override // defpackage.AbstractC13656e
    public final String toString() {
        switch (this.vip) {
            case 0:
                return ((Number) this.ad).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.ad).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.ad).longValue() + ".toULong()";
            default:
                return ((Number) this.ad).intValue() + ".toUShort()";
        }
    }
}
