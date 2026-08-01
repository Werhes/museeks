package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٛٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C11848e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0604e f23760e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23761e;

    public /* synthetic */ C11848e(C0604e c0604e, int i) {
        this.f23761e = i;
        this.f23760e = c0604e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C7469e c7469e = (C7469e) obj;
        switch (this.f23761e) {
            case 0:
                c7469e.ad(C9582e.vip, "type");
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
                C0604e c0604e = this.f23760e;
                sb.append(c0604e.ad.mopub());
                sb.append('>');
                C11848e c11848e = new C11848e(c0604e, 1);
                c7469e.ad(AbstractC10003e.license(sb.toString(), C6587e.appmetrica, new InterfaceC9998e[0], c11848e), "value");
                c7469e.vip = c0604e.vip;
                return Unit.INSTANCE;
            default:
                for (Map.Entry entry : this.f23760e.appmetrica.entrySet()) {
                    c7469e.ad(((InterfaceC5372e) entry.getValue()).appmetrica(), (String) entry.getKey());
                }
                return Unit.INSTANCE;
        }
    }
}
