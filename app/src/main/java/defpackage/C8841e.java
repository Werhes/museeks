package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٝۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8841e implements Function0 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f17760e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f17761e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f17762e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f17763e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17764e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f17765e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f17766e;

    public /* synthetic */ C8841e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f17764e = i;
        this.f17762e = obj;
        this.f17761e = obj2;
        this.f17763e = obj3;
        this.f17760e = obj4;
        this.f17766e = obj5;
        this.f17765e = obj6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.f17764e) {
            case 0:
                C13840e c13840e = (C13840e) this.f17762e;
                InterfaceC12163e interfaceC12163e = (InterfaceC12163e) this.f17761e;
                InterfaceC5039e interfaceC5039e = (InterfaceC5039e) this.f17763e;
                String str = (String) this.f17760e;
                Object[] objArr = (Object[]) this.f17765e;
                boolean z2 = true;
                if (c13840e.f27414e != interfaceC5039e) {
                    c13840e.f27414e = interfaceC5039e;
                    z = true;
                } else {
                    z = false;
                }
                if (AbstractC7890e.billing(c13840e.f27413e, str)) {
                    z2 = z;
                } else {
                    c13840e.f27413e = str;
                }
                c13840e.f27416e = interfaceC12163e;
                c13840e.f27415e = this.f17766e;
                c13840e.f27412e = objArr;
                InterfaceC10153e interfaceC10153e = c13840e.f27418e;
                if (interfaceC10153e != null && z2) {
                    ((C15024e) interfaceC10153e).ads();
                    c13840e.f27418e = null;
                    c13840e.license();
                }
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(((C14132e) this.f17762e).ad((C18327e) this.f17761e, (ArrayList) this.f17763e, (LinkedHashMap) this.f17760e, (List) this.f17766e, (ArrayList) this.f17765e));
            default:
                C12380e c12380e = (C12380e) this.f17762e;
                C12380e c12380e2 = (C12380e) this.f17761e;
                InterfaceC16054e interfaceC16054e = (InterfaceC16054e) this.f17763e;
                C6260e c6260e = (C6260e) this.f17760e;
                C6260e c6260e2 = (C6260e) this.f17766e;
                C4320e c4320e = (C4320e) this.f17765e;
                if (c12380e.vip().f33322e.length() > 0 && c12380e2.vip().f33322e.length() > 0) {
                    AbstractC4653e.startapp(interfaceC16054e);
                    c6260e.ad();
                    c6260e2.ad();
                    c4320e.f9436e.setValue(c12380e.vip().f33322e.toString());
                    c4320e.f9439e.setValue(c12380e2.vip().f33322e.toString());
                    c4320e.f9435e.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
        }
    }
}
