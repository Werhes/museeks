package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4788e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f10214e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f10215e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f10216e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f10217e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10218e = 1;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f10219e;

    public /* synthetic */ C4788e(C18013e c18013e, int i, Map map, C15816e c15816e, realm_value_t realm_value_tVar) {
        this.f10215e = c18013e;
        this.f10216e = i;
        this.f10217e = map;
        this.f10214e = c15816e;
        this.f10219e = realm_value_tVar;
    }

    public /* synthetic */ C4788e(AbstractC2832e[] abstractC2832eArr, C4789e c4789e, int i, InterfaceC13158e interfaceC13158e, int[] iArr) {
        this.f10215e = abstractC2832eArr;
        this.f10217e = c4789e;
        this.f10216e = i;
        this.f10214e = interfaceC13158e;
        this.f10219e = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14287e startapp;
        int i = this.f10218e;
        int i2 = 0;
        Object obj2 = this.f10219e;
        Object obj3 = this.f10214e;
        Object obj4 = this.f10217e;
        int i3 = this.f10216e;
        Object obj5 = this.f10215e;
        switch (i) {
            case 0:
                AbstractC2832e[] abstractC2832eArr = (AbstractC2832e[]) obj5;
                C4789e c4789e = (C4789e) obj4;
                InterfaceC13158e interfaceC13158e = (InterfaceC13158e) obj3;
                int[] iArr = (int[]) obj2;
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                int length = abstractC2832eArr.length;
                int i4 = 0;
                while (i2 < length) {
                    AbstractC2832e abstractC2832e = abstractC2832eArr[i2];
                    int i5 = i4 + 1;
                    Object signatures = abstractC2832e.signatures();
                    C11249e c11249e = signatures instanceof C11249e ? (C11249e) signatures : null;
                    EnumC7792e layoutDirection = interfaceC13158e.getLayoutDirection();
                    AbstractC11750e abstractC11750e = c11249e != null ? c11249e.metrica : null;
                    abstractC3698e.billing(abstractC2832e, abstractC11750e != null ? abstractC11750e.license(i3, abstractC2832e.f6806e, layoutDirection) : c4789e.vip.ad(abstractC2832e.f6806e, i3, layoutDirection), iArr[i4], 0.0f);
                    i2++;
                    i4 = i5;
                }
                return Unit.INSTANCE;
            default:
                C18013e c18013e = (C18013e) obj5;
                Map map = (Map) obj4;
                C15816e c15816e = (C15816e) obj3;
                realm_value_t realm_value_tVar = (realm_value_t) obj2;
                InterfaceC5045e interfaceC5045e = (InterfaceC5045e) obj;
                boolean z = c18013e.f35330e;
                if (z) {
                    startapp = ((C8648e) interfaceC5045e).startapp(AbstractC3820e.ad.vip(InterfaceC16120e.class));
                } else {
                    if (z) {
                        throw new C14803e(10);
                    }
                    startapp = ((C8648e) interfaceC5045e).startapp(AbstractC3820e.ad.vip(InterfaceC17544e.class));
                }
                C17974e c17974e = c18013e.f35334e;
                InterfaceC15348e interfaceC15348e = c18013e.f35332e;
                if (startapp != null) {
                    C13655e f36702e = ((InterfaceC10518e) startapp).getF36702e();
                    if (f36702e == null) {
                        startapp = AbstractC3422e.ad(c17974e, interfaceC15348e.crashlytics(), startapp, i3, map);
                    } else if (!AbstractC7890e.billing(f36702e.f27072e, interfaceC15348e)) {
                        throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                    }
                } else {
                    startapp = null;
                }
                realm_value_t m4012break = c15816e.m4012break(startapp != null ? ((InterfaceC10518e) startapp).getF36702e() : null);
                LongPointerWrapper longPointerWrapper = c18013e.f35333e;
                realm_value_t realm_value_tVar2 = new realm_value_t();
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i6 = AbstractC6026e.ad;
                realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_t.vip(realm_value_tVar), realm_value_tVar, realm_value_tVar2.ad, realm_value_tVar2, new boolean[1]);
                boolean[] zArr = new boolean[1];
                realmcJNI.realm_dictionary_insert(longPointerWrapper.getPtr$cinterop_release(), realm_value_t.vip(realm_value_tVar), realm_value_tVar, m4012break.ad, m4012break, new long[1], zArr);
                return new C6571e(c18013e.license(realm_value_tVar2, realm_value_tVar), Boolean.valueOf(zArr[0]));
        }
    }
}
