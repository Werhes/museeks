package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۘؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17958e extends AbstractC1776e {
    public final C1244e metrica;
    public final /* synthetic */ int vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17958e(C1244e c1244e, int i) {
        super(Float.valueOf(0.0f));
        this.vip = i;
        switch (i) {
            case 1:
                super(0);
                this.metrica = c1244e;
                c1244e.ad().setTint(0);
                return;
            default:
                this.metrica = c1244e;
                C14703e ad = c1244e.ad();
                ad.getClass();
                ad.setBounds(0, 0, AbstractC1561e.appmetrica(0.0f), AbstractC1561e.appmetrica(0.0f));
                return;
        }
    }

    public final void appmetrica(Object obj) {
        switch (this.vip) {
            case 0:
                Float f = (Float) obj;
                if (((Float) this.ad).equals(f)) {
                    return;
                }
                this.ad = f;
                C14703e ad = this.metrica.ad();
                float floatValue = ((Float) this.ad).floatValue();
                ad.getClass();
                float f2 = floatValue * 2.0f;
                ad.setBounds(0, 0, AbstractC1561e.appmetrica(f2), AbstractC1561e.appmetrica(f2));
                return;
            default:
                Integer num = (Integer) obj;
                if (((Integer) this.ad).equals(num)) {
                    return;
                }
                this.ad = num;
                this.metrica.ad().setTint(((Integer) this.ad).intValue());
                return;
        }
    }
}
