package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15449e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f30533e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f30534e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30535e;

    public /* synthetic */ C15449e(C6613e c6613e, int i, int i2) {
        this.f30535e = i2;
        this.f30534e = c6613e;
        this.f30533e = i;
    }

    public C15449e(C16929e c16929e, C0764e c0764e, int i) {
        this.f30535e = 2;
        this.f30534e = c0764e;
        this.f30533e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f30535e;
        int i2 = this.f30533e;
        Object obj2 = this.f30534e;
        switch (i) {
            case 0:
                realm_value_t realm_value_tVar = ((C6600e) obj).ad;
                long ptr$cinterop_release = ((LongPointerWrapper) ((C6613e) obj2).f13645e).getPtr$cinterop_release();
                int i3 = AbstractC6026e.ad;
                realmcJNI.realm_list_insert(ptr$cinterop_release, i2, realm_value_tVar.ad, realm_value_tVar);
                return Unit.INSTANCE;
            case 1:
                realm_value_t realm_value_tVar2 = ((C6600e) obj).ad;
                long ptr$cinterop_release2 = ((LongPointerWrapper) ((C6613e) obj2).f13645e).getPtr$cinterop_release();
                int i4 = AbstractC6026e.ad;
                realmcJNI.realm_list_set(ptr$cinterop_release2, i2, realm_value_tVar2.ad, realm_value_tVar2);
                return Unit.INSTANCE;
            default:
                C0764e c0764e = (C0764e) obj2;
                InterfaceC16132e interfaceC16132e = c0764e.f3119e;
                C5267e c5267e = (C5267e) interfaceC16132e.getValue();
                ArrayList arrayList = new ArrayList(((C5267e) interfaceC16132e.getValue()).f11346e);
                arrayList.set(i2, (C14056e) obj);
                Unit unit = Unit.INSTANCE;
                c0764e.setValue(C5267e.vip(c5267e, false, false, 0, 0, arrayList, 47));
                return Unit.INSTANCE;
        }
    }
}
