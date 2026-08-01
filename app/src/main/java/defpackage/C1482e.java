package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۧٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1482e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4157e f4353e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4354e;

    public /* synthetic */ C1482e(C4157e c4157e, int i) {
        this.f4354e = i;
        this.f4353e = c4157e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4354e) {
            case 0:
                C4017e c4017e = (C4017e) obj;
                C4157e c4157e = this.f4353e;
                C7558e c7558e = c4157e.f22946e;
                float floatValue = c7558e != null ? ((Number) c7558e.license()).floatValue() : 0.0f;
                C15781e c15781e = c4157e.f22950e;
                C14434e c14434e = c4017e.f8940e;
                C14434e c14434e2 = c4017e.f8940e;
                c15781e.ad(c14434e.f28537e.m4560try(), c4017e.mo497instanceof(c4157e.f22949e), c4157e.m1474e(), floatValue, floatValue > 0.0f ? c4157e.f22953e.purchase() : 0.0f, c4017e.mo497instanceof(c4157e.f22943e), c4157e.f22951e, c4157e.f22954e);
                C15781e c15781e2 = c4157e.f22950e;
                float f = c4017e.getLayoutDirection() != EnumC7792e.f15794e ? 180.0f : 0.0f;
                long mo779e = c14434e2.mo779e();
                C18478e c18478e = c14434e2.f28537e;
                long m4560try = c18478e.m4560try();
                c18478e.m4557this().billing();
                try {
                    ((C5389e) c18478e.f36228e).crashlytics(f, mo779e);
                    AbstractC4653e.Signature(c4017e, c15781e2.advert, c4157e.f22944e, 0.0f, c4157e.f22954e, 52);
                    C17985e[] c17985eArr = c15781e2.smaato;
                    if (c17985eArr != null) {
                        for (C17985e c17985e : c17985eArr) {
                            AbstractC4653e.Signature(c4017e, c17985e, c4157e.f22945e, 0.0f, c4157e.f22951e, 52);
                        }
                    }
                    AbstractC16947e.vip(c4017e, c4157e.m1474e()[1], c4017e.yandex(), c4157e.f9172e, c15781e2.amazon, c4157e.f22954e, c4157e.f22945e);
                    AbstractC0054e.m224this(c18478e, m4560try);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    AbstractC0054e.m224this(c18478e, m4560try);
                    throw th;
                }
            default:
                C8953e c8953e = (C8953e) obj;
                C4157e c4157e2 = this.f4353e;
                float floatValue2 = ((Number) c4157e2.f9171e.invoke()).floatValue();
                if (floatValue2 < 0.0f) {
                    floatValue2 = 0.0f;
                }
                if (floatValue2 > 1.0f) {
                    floatValue2 = 1.0f;
                }
                float floatValue3 = ((Number) c4157e2.f9170e.invoke(Float.valueOf(floatValue2))).floatValue();
                float f2 = floatValue3 >= 0.0f ? floatValue3 : 0.0f;
                c4157e2.m3204e(f2 <= 1.0f ? f2 : 1.0f);
                return c8953e.ad(new C1482e(c4157e2, 0));
        }
    }
}
