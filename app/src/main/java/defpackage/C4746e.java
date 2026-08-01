package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4746e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f10159e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f10160e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Map f10161e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C13655e f10162e;

    public C4746e(C13655e c13655e, long j, int i, Map map) {
        this.f10162e = c13655e;
        this.f10160e = j;
        this.f10159e = i;
        this.f10161e = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14287e startapp = ((C8648e) ((InterfaceC5045e) obj)).startapp(AbstractC3820e.ad.vip(InterfaceC14287e.class));
        C13655e c13655e = this.f10162e;
        c13655e.ad();
        C17974e c17974e = c13655e.f27074e;
        InterfaceC15348e interfaceC15348e = c13655e.f27072e;
        if (startapp != null) {
            C13655e f36708e = ((InterfaceC10518e) startapp).getF36708e();
            if (f36708e == null) {
                startapp = AbstractC3422e.ad(c17974e, interfaceC15348e.crashlytics(), startapp, this.f10159e, this.f10161e);
            } else if (!AbstractC7890e.billing(f36708e.f27072e, interfaceC15348e)) {
                throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
            }
        } else {
            startapp = null;
        }
        C13655e f36708e2 = startapp != null ? ((InterfaceC10518e) startapp).getF36708e() : null;
        C15816e c15816e = new C15816e(15);
        realm_value_t m4012break = c15816e.m4012break(f36708e2);
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_value(ptr$cinterop_release, this.f10160e, m4012break.ad, m4012break, false);
        Unit unit = Unit.INSTANCE;
        c15816e.m4020interface();
        return Unit.INSTANCE;
    }
}
