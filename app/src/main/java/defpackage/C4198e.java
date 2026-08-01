package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4198e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9242e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ String f9243e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C10263e f9244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4198e(String str, InterfaceC5083e interfaceC5083e, int i) {
        super(4, interfaceC5083e);
        this.f9242e = i;
        this.f9243e = str;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C10263e c10263e = (C10263e) obj2;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj4;
        switch (this.f9242e) {
            case 0:
                C4198e c4198e = new C4198e(this.f9243e, interfaceC5083e, 0);
                c4198e.f9244e = c10263e;
                return c4198e.loadAd(Unit.INSTANCE);
            default:
                C4198e c4198e2 = new C4198e(this.f9243e, interfaceC5083e, 1);
                c4198e2.f9244e = c10263e;
                return c4198e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f9242e) {
            case 0:
                C10263e c10263e = this.f9244e;
                AbstractC2003e.purchase(obj);
                if (((Map) c10263e.metrica.f36443e).containsKey("Accept-Encoding")) {
                    return Unit.INSTANCE;
                }
                InterfaceC4911e interfaceC4911e = AbstractC10725e.ad;
                boolean yandex = interfaceC4911e.yandex();
                String str = this.f9243e;
                if (yandex) {
                    StringBuilder applovin = AbstractC8703e.applovin("Adding Accept-Encoding=", str, " for ");
                    applovin.append(c10263e.ad);
                    interfaceC4911e.amazon(applovin.toString());
                }
                c10263e.metrica.m4622e("Accept-Encoding", str);
                return Unit.INSTANCE;
            default:
                C10263e c10263e2 = this.f9244e;
                AbstractC2003e.purchase(obj);
                if (!((Map) c10263e2.metrica.f36443e).containsKey("User-Agent")) {
                    AbstractC9506e.ad.amazon("Adding User-Agent header: agent for " + c10263e2.ad);
                    c10263e2.metrica.mo859e("User-Agent", this.f9243e.toString());
                }
                return Unit.INSTANCE;
        }
    }
}
