package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8509e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17301e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f17302e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13655e f17303e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f17304e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17305e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Map f17306e;

    public /* synthetic */ C8509e(C13655e c13655e, long j, Object obj, int i, Map map, int i2) {
        this.f17305e = i2;
        this.f17303e = c13655e;
        this.f17302e = j;
        this.f17304e = obj;
        this.f17301e = i;
        this.f17306e = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f17305e;
        Map map = this.f17306e;
        int i2 = this.f17301e;
        Object obj2 = this.f17304e;
        long j = this.f17302e;
        C13655e c13655e = this.f17303e;
        switch (i) {
            case 0:
                LongPointerWrapper longPointerWrapper = c13655e.f27071e;
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i3 = AbstractC6026e.ad;
                realmcJNI.realm_set_list(ptr$cinterop_release, j);
                LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_get_list(longPointerWrapper.getPtr$cinterop_release(), j), false, 2, null);
                realmcJNI.realm_list_clear(longPointerWrapper2.getPtr$cinterop_release());
                return Boolean.valueOf(AbstractC5087e.yandex(new C6613e(c13655e.f27074e, c13655e.f27072e, longPointerWrapper2, false, false), 0, (InterfaceC17101e) ((C8648e) ((InterfaceC5045e) obj2)).advert(12), i2, map));
            default:
                LongPointerWrapper longPointerWrapper3 = c13655e.f27071e;
                long ptr$cinterop_release2 = longPointerWrapper3.getPtr$cinterop_release();
                int i4 = AbstractC6026e.ad;
                realmcJNI.realm_set_dictionary(ptr$cinterop_release2, j);
                LongPointerWrapper longPointerWrapper4 = new LongPointerWrapper(realmcJNI.realm_get_dictionary(longPointerWrapper3.getPtr$cinterop_release(), j), false, 2, null);
                realmcJNI.realm_dictionary_clear(longPointerWrapper4.getPtr$cinterop_release());
                AbstractC5087e.pro(AbstractC6022e.yandex(c13655e.f27074e, c13655e.f27072e, longPointerWrapper4, false, false), (InterfaceC6128e) ((C8648e) ((InterfaceC5045e) obj2)).advert(13), i2, map);
                return Unit.INSTANCE;
        }
    }
}
