package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14028e implements Function5 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27749e;

    public /* synthetic */ C14028e(int i) {
        this.f27749e = i;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        switch (this.f27749e) {
            case 0:
                InterfaceC10601e interfaceC10601e = (InterfaceC10601e) obj;
                InterfaceC1403e interfaceC1403e = (InterfaceC1403e) obj2;
                Function0 function0 = (Function0) obj3;
                C13770e c13770e = (C13770e) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    i = ((intValue & 8) == 0 ? c13770e.purchase(interfaceC10601e) : c13770e.yandex(interfaceC10601e) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= (intValue & 64) == 0 ? c13770e.purchase(interfaceC1403e) : c13770e.yandex(interfaceC1403e) ? 32 : 16;
                }
                if ((intValue & 384) == 0) {
                    i |= c13770e.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                }
                if (c13770e.m3673protected(i & 1, (i & 1171) != 1170)) {
                    AbstractC5132e.metrica(interfaceC10601e, interfaceC1403e, function0, c13770e, i & 1022);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC10601e interfaceC10601e2 = (InterfaceC10601e) obj;
                InterfaceC1403e interfaceC1403e2 = (InterfaceC1403e) obj2;
                Function0 function02 = (Function0) obj3;
                C13770e c13770e2 = (C13770e) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = ((intValue2 & 8) == 0 ? c13770e2.purchase(interfaceC10601e2) : c13770e2.yandex(interfaceC10601e2) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= (intValue2 & 64) == 0 ? c13770e2.purchase(interfaceC1403e2) : c13770e2.yandex(interfaceC1403e2) ? 32 : 16;
                }
                if ((intValue2 & 384) == 0) {
                    i2 |= c13770e2.yandex(function02) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                }
                if (c13770e2.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
                    AbstractC5132e.metrica(interfaceC10601e2, interfaceC1403e2, function02, c13770e2, i2 & 1022);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                C12347e c12347e = (C12347e) obj5;
                String obj6 = ((CharSequence) obj4).subSequence(C12347e.billing(c12347e.ad), C12347e.purchase(c12347e.ad)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                return Unit.INSTANCE;
        }
    }
}
