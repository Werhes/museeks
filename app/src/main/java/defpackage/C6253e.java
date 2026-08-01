package defpackage;

import java.util.WeakHashMap;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6253e implements Function3 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ float f13070e;

    public /* synthetic */ C6253e(float f) {
        this.f13070e = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC12864e interfaceC12864e = (InterfaceC12864e) obj;
        C13770e c13770e = (C13770e) obj2;
        ((Integer) obj3).getClass();
        c13770e.m3676strictfp(216864039);
        WeakHashMap weakHashMap = C8845e.isVip;
        C15752e c15752e = C16728e.subscription(c13770e).metrica;
        InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
        float mo496final = interfaceC14388e.mo496final(c15752e.metrica(interfaceC14388e)) - this.f13070e;
        float f = 0;
        InterfaceC12864e loadAd = AbstractC12220e.loadAd(interfaceC12864e, 0.0f, 0.0f, 0.0f, mo496final < f ? f : mo496final, 7);
        c13770e.Signature(false);
        return loadAd;
    }
}
