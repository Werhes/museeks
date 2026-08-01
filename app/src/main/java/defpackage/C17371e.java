package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17371e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34073e;

    public /* synthetic */ C17371e(int i) {
        this.f34073e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34073e) {
            case 0:
                return Collections.singletonList(C14907e.INSTANCE);
            case 1:
                return Collections.singletonList(C14148e.INSTANCE);
            case 2:
                return Collections.singletonList(C10139e.INSTANCE);
            case 3:
                return Collections.singletonList(C14907e.INSTANCE);
            case 4:
                return Collections.singletonList(C14148e.INSTANCE);
            case 5:
                float floatValue = ((Float) obj).floatValue();
                return Float.valueOf((floatValue <= 0.1f || floatValue >= 0.95f) ? 0.0f : 1.0f);
            case 6:
                Map map = (Map) obj;
                C8921e c8921e = new C8921e(C0079e.ad);
                c8921e.license.setValue((String) map.get("pagetitle"));
                c8921e.ad.setValue((String) map.get("lastloaded"));
                c8921e.billing = (Bundle) map.get("bundle");
                return c8921e;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return ((C8845e) obj).advert;
            case 9:
                return ((C8845e) obj).vip;
            case 10:
                return ((C8845e) obj).purchase;
            case 11:
                return ((C8845e) obj).metrica;
            case 12:
                return ((C8845e) obj).appmetrica;
            case 13:
                return (InterfaceC13848e) obj;
            default:
                return Boolean.TRUE;
        }
    }
}
