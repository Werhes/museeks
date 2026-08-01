package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13955e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8512e f27673e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27674e;

    public /* synthetic */ C13955e(C8512e c8512e, int i) {
        this.f27674e = i;
        this.f27673e = c8512e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27674e) {
            case 0:
                C8512e c8512e = this.f27673e;
                c8512e.m3204e(c8512e.f17319e);
                return ((C8953e) obj).ad(new C13955e(c8512e, 1));
            default:
                C4017e c4017e = (C4017e) obj;
                C8512e c8512e2 = this.f27673e;
                C7558e c7558e = c8512e2.f22946e;
                float floatValue = c7558e != null ? ((Number) c7558e.license()).floatValue() : 0.0f;
                C15781e c15781e = c8512e2.f22950e;
                C14434e c14434e = c4017e.f8940e;
                C14434e c14434e2 = c4017e.f8940e;
                long m4560try = c14434e.f28537e.m4560try();
                float mo497instanceof = c4017e.mo497instanceof(c8512e2.f22949e);
                float[] fArr = c8512e2.f17318e;
                fArr[0] = ((Number) c8512e2.f17314e.invoke()).floatValue();
                fArr[1] = ((Number) c8512e2.f17316e.invoke()).floatValue();
                fArr[2] = ((Number) c8512e2.f17313e.invoke()).floatValue();
                fArr[3] = ((Number) c8512e2.f17317e.invoke()).floatValue();
                c15781e.ad(m4560try, mo497instanceof, fArr, floatValue, floatValue > 0.0f ? c8512e2.f22953e.purchase() : 0.0f, c4017e.mo497instanceof(c8512e2.f22943e), c8512e2.f22951e, c8512e2.f22954e);
                C15781e c15781e2 = c8512e2.f22950e;
                float f = c4017e.getLayoutDirection() != EnumC7792e.f15794e ? 180.0f : 0.0f;
                long mo779e = c14434e2.mo779e();
                C18478e c18478e = c14434e2.f28537e;
                long m4560try2 = c18478e.m4560try();
                c18478e.m4557this().billing();
                try {
                    ((C5389e) c18478e.f36228e).crashlytics(f, mo779e);
                    AbstractC4653e.Signature(c4017e, c15781e2.advert, c8512e2.f22944e, 0.0f, c8512e2.f22954e, 52);
                    C17985e[] c17985eArr = c15781e2.smaato;
                    if (c17985eArr != null) {
                        for (C17985e c17985e : c17985eArr) {
                            AbstractC4653e.Signature(c4017e, c17985e, c8512e2.f22945e, 0.0f, c8512e2.f22951e, 52);
                        }
                    }
                    AbstractC0054e.m224this(c18478e, m4560try2);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    AbstractC0054e.m224this(c18478e, m4560try2);
                    throw th;
                }
        }
    }
}
