package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2019e extends AbstractC13656e {
    public final /* synthetic */ int vip = 1;

    public C2019e(double d) {
        super(Double.valueOf(d));
    }

    public C2019e(float f) {
        super(Float.valueOf(f));
    }

    public /* synthetic */ C2019e(Object obj) {
        super(obj);
    }

    @Override // defpackage.AbstractC13656e
    public final AbstractC1186e ad(InterfaceC5334e interfaceC5334e) {
        switch (this.vip) {
            case 0:
                AbstractC13270e amazon = interfaceC5334e.amazon();
                amazon.getClass();
                return amazon.remoteconfig(EnumC3702e.BOOLEAN);
            case 1:
                AbstractC13270e amazon2 = interfaceC5334e.amazon();
                amazon2.getClass();
                return amazon2.remoteconfig(EnumC3702e.DOUBLE);
            default:
                AbstractC13270e amazon3 = interfaceC5334e.amazon();
                amazon3.getClass();
                return amazon3.remoteconfig(EnumC3702e.FLOAT);
        }
    }

    @Override // defpackage.AbstractC13656e
    public String toString() {
        switch (this.vip) {
            case 1:
                return ((Number) this.ad).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.ad).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }
}
