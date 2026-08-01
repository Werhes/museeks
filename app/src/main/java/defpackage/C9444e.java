package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9444e implements InterfaceC13543e {
    public static final C9444e metrica = new C9444e(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, 0);
    public final /* synthetic */ int ad;
    public float[] vip;

    public /* synthetic */ C9444e() {
        this.ad = 1;
    }

    public /* synthetic */ C9444e(float[] fArr, int i) {
        this.ad = i;
        this.vip = fArr;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.ArrayList vip(defpackage.C9444e r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9444e.vip(eٍْٚ, java.lang.String):java.util.ArrayList");
    }

    @Override // defpackage.InterfaceC13543e
    public long ad(float f, float f2) {
        long vip = C6739e.vip((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), this.vip);
        return C9268e.ad(Float.intBitsToFloat((int) (vip >> 32)), Float.intBitsToFloat((int) (vip & 4294967295L)));
    }

    public String toString() {
        switch (this.ad) {
            case 0:
                return "Bradford";
            default:
                return super.toString();
        }
    }
}
