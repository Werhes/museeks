package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10606e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f20907e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13655e f20908e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20909e;

    public /* synthetic */ C10606e(C13655e c13655e, long j, int i) {
        this.f20909e = i;
        this.f20908e = c13655e;
        this.f20907e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20909e;
        C13655e c13655e = this.f20908e;
        switch (i) {
            case 0:
                realm_value_t realm_value_tVar = ((C6600e) obj).ad;
                long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
                int i2 = AbstractC6026e.ad;
                realmcJNI.realm_set_value(ptr$cinterop_release, this.f20907e, realm_value_tVar.ad, realm_value_tVar, false);
                return Unit.INSTANCE;
            default:
                realm_value_t realm_value_tVar2 = ((C6600e) obj).ad;
                long ptr$cinterop_release2 = c13655e.f27071e.getPtr$cinterop_release();
                int i3 = AbstractC6026e.ad;
                realmcJNI.realm_set_value(ptr$cinterop_release2, this.f20907e, realm_value_tVar2.ad, realm_value_tVar2, false);
                return Unit.INSTANCE;
        }
    }
}
