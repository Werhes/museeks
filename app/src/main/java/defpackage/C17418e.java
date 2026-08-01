package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۦٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17418e implements Function8 {
    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i;
        InterfaceC12864e interfaceC12864e = (InterfaceC12864e) obj;
        String str = (String) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C12776e c12776e = (C12776e) obj4;
        Function3 function3 = (Function3) obj5;
        Function0 function0 = (Function0) obj6;
        C13770e c13770e = (C13770e) obj7;
        int intValue = ((Integer) obj8).intValue();
        if ((intValue & 6) == 0) {
            i = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= c13770e.purchase(str) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= c13770e.billing(booleanValue) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= c13770e.purchase(c12776e) ? 2048 : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= c13770e.yandex(function3) ? 16384 : 8192;
        }
        if ((intValue & 196608) == 0) {
            i |= c13770e.yandex(function0) ? 131072 : 65536;
        }
        if (c13770e.m3673protected(i & 1, (599187 & i) != 599186)) {
            AbstractC3435e.metrica(str, booleanValue, c12776e, interfaceC12864e, function3, function0, c13770e, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
