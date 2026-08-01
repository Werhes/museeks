package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2633e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6498e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f6499e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f6500e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f6501e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6502e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f6503e;

    public /* synthetic */ C2633e(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        this.f6502e = i3;
        this.f6500e = obj;
        this.f6499e = i;
        this.f6503e = obj2;
        this.f6501e = i2;
        this.f6498e = obj3;
    }

    public /* synthetic */ C2633e(ArrayList arrayList, C2907e c2907e, int i, ArrayList arrayList2, int i2) {
        this.f6502e = 2;
        this.f6500e = arrayList;
        this.f6503e = c2907e;
        this.f6499e = i;
        this.f6498e = arrayList2;
        this.f6501e = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14287e startapp;
        C13655e f36708e;
        int i = this.f6502e;
        Object obj2 = this.f6498e;
        int i2 = this.f6501e;
        Object obj3 = this.f6503e;
        int i3 = this.f6499e;
        Object obj4 = this.f6500e;
        switch (i) {
            case 0:
                C6613e c6613e = (C6613e) obj4;
                Map map = (Map) obj3;
                C15816e c15816e = (C15816e) obj2;
                InterfaceC5045e interfaceC5045e = (InterfaceC5045e) obj;
                boolean z = c6613e.f13642e;
                if (z) {
                    startapp = ((C8648e) interfaceC5045e).startapp(AbstractC3820e.ad.vip(InterfaceC16120e.class));
                } else {
                    if (z) {
                        throw new C14803e(10);
                    }
                    startapp = ((C8648e) interfaceC5045e).startapp(AbstractC3820e.ad.vip(InterfaceC17544e.class));
                }
                C17974e c17974e = (C17974e) c6613e.f13643e;
                InterfaceC15348e interfaceC15348e = (InterfaceC15348e) c6613e.f13640e;
                if (startapp != null) {
                    C13655e f36708e2 = ((InterfaceC10518e) startapp).getF36708e();
                    if (f36708e2 == null) {
                        startapp = AbstractC3422e.ad(c17974e, interfaceC15348e.crashlytics(), startapp, i3, map);
                    } else if (!AbstractC7890e.billing(f36708e2.f27072e, interfaceC15348e)) {
                        throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                    }
                } else {
                    startapp = null;
                }
                f36708e = startapp != null ? ((InterfaceC10518e) startapp).getF36708e() : null;
                LongPointerWrapper longPointerWrapper = (LongPointerWrapper) c6613e.f13645e;
                realm_value_t m4012break = c15816e.m4012break(f36708e);
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i4 = AbstractC6026e.ad;
                realmcJNI.realm_list_insert(ptr$cinterop_release, i2, m4012break.ad, m4012break);
                return Unit.INSTANCE;
            case 1:
                C6613e c6613e2 = (C6613e) obj4;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                C15816e c15816e2 = (C15816e) obj2;
                InterfaceC14287e startapp2 = ((C8648e) ((InterfaceC5045e) obj)).startapp(AbstractC3820e.ad.vip(InterfaceC14287e.class));
                C17974e c17974e2 = (C17974e) c6613e2.f13643e;
                InterfaceC15348e interfaceC15348e2 = (InterfaceC15348e) c6613e2.f13640e;
                if (startapp2 != null) {
                    C13655e f36708e3 = ((InterfaceC10518e) startapp2).getF36708e();
                    if (f36708e3 == null) {
                        startapp2 = AbstractC3422e.ad(c17974e2, interfaceC15348e2.crashlytics(), startapp2, i3, linkedHashMap);
                    } else if (!AbstractC7890e.billing(f36708e3.f27072e, interfaceC15348e2)) {
                        throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                    }
                } else {
                    startapp2 = null;
                }
                f36708e = startapp2 != null ? ((InterfaceC10518e) startapp2).getF36708e() : null;
                LongPointerWrapper longPointerWrapper2 = (LongPointerWrapper) c6613e2.f13645e;
                realm_value_t m4012break2 = c15816e2.m4012break(f36708e);
                long ptr$cinterop_release2 = longPointerWrapper2.getPtr$cinterop_release();
                int i5 = AbstractC6026e.ad;
                realmcJNI.realm_list_set(ptr$cinterop_release2, i2, m4012break2.ad, m4012break2);
                return Unit.INSTANCE;
            case 2:
                ArrayList arrayList = (ArrayList) obj4;
                C2907e c2907e = (C2907e) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    AbstractC2832e abstractC2832e = (AbstractC2832e) arrayList.get(i6);
                    abstractC3698e.billing(abstractC2832e, 0, (i2 - abstractC2832e.f6804e) / 2, 0.0f);
                }
                float f = C10102e.metrica;
                abstractC3698e.getClass();
                int ad = AbstractC4653e.ad(abstractC3698e, AbstractC7260e.ad) + AbstractC4653e.ad(abstractC3698e, f);
                C7558e c7558e = c2907e.metrica;
                if (c7558e != null) {
                    i3 = ((Number) c7558e.license()).intValue();
                }
                int i7 = ad + i3;
                int size2 = arrayList2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    AbstractC2832e abstractC2832e2 = (AbstractC2832e) arrayList2.get(i8);
                    abstractC3698e.billing(abstractC2832e2, i7, (i2 - abstractC2832e2.f6804e) / 2, 0.0f);
                }
                return Unit.INSTANCE;
            default:
                AbstractC3698e.adcel((AbstractC3698e) obj, (AbstractC2832e) obj3, ((C11490e) ((C5669e) obj4).f12048e.invoke(new C12729e(((i3 - r5.f6806e) << 32) | ((i2 - r5.f6804e) & 4294967295L)), ((InterfaceC13158e) obj2).getLayoutDirection())).ad);
                return Unit.INSTANCE;
        }
    }
}
