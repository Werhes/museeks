package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3347e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ String f3348e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f3349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0935e(String str, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f3347e = i;
        this.f3348e = str;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f3347e) {
            case 0:
                C0935e c0935e = new C0935e(this.f3348e, interfaceC5083e, 0);
                c0935e.f3349e = obj;
                return c0935e;
            case 1:
                C0935e c0935e2 = new C0935e(this.f3348e, interfaceC5083e, 1);
                c0935e2.f3349e = obj;
                return c0935e2;
            default:
                C0935e c0935e3 = new C0935e(this.f3348e, interfaceC5083e, 2);
                c0935e3.f3349e = obj;
                return c0935e3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3347e) {
            case 0:
                return ((C0935e) advert((InterfaceC5083e) obj2, (C3147e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C0935e) advert((InterfaceC5083e) obj2, (C13034e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C0935e) advert((InterfaceC5083e) obj2, (C3487e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Map map;
        switch (this.f3347e) {
            case 0:
                C3147e c3147e = (C3147e) this.f3349e;
                AbstractC2003e.purchase(obj);
                return C3147e.vip(c3147e, null, this.f3348e, System.currentTimeMillis(), 159);
            case 1:
                C13034e c13034e = (C13034e) this.f3349e;
                AbstractC2003e.purchase(obj);
                return C13034e.vip(c13034e, false, this.f3348e, null, false, false, 253);
            default:
                C3487e c3487e = (C3487e) this.f3349e;
                AbstractC2003e.purchase(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap(c3487e.f7758e);
                linkedHashMap.remove(this.f3348e);
                int size = linkedHashMap.size();
                if (size != 0) {
                    map = linkedHashMap;
                    if (size == 1) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        map = Collections.singletonMap(entry.getKey(), entry.getValue());
                    }
                } else {
                    map = C9139e.f18290e;
                }
                return C3487e.vip(c3487e, 0, 0, 0, 0, 0, 0, false, false, false, false, map, 0, false, 15359);
        }
    }
}
