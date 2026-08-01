package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۘۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17224e implements InterfaceC6781e {
    public static final C17224e ad = new Object();

    @Override // defpackage.InterfaceC6781e
    public final Unit ad() {
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC6781e
    public final Object metrica(InterfaceC5083e interfaceC5083e, Object obj) {
        return Boolean.valueOf(((C3147e) obj).f7229e.size() != EnumC0698e.f2987e.subs());
    }

    @Override // defpackage.InterfaceC6781e
    public final Object vip(Object obj, C13696e c13696e) {
        boolean z;
        C3147e c3147e = (C3147e) obj;
        List<EnumC0698e> m3607transient = AbstractC13480e.m3607transient(EnumC0698e.f2987e);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m3607transient, 10));
        for (EnumC0698e enumC0698e : m3607transient) {
            int ordinal = enumC0698e.ordinal();
            if (ordinal != 0) {
                z = true;
                if (ordinal == 1) {
                    z = c3147e.f7228e;
                } else if (ordinal == 2) {
                    z = c3147e.f7231e;
                } else if (ordinal == 3) {
                    z = c3147e.f7233e;
                }
            } else {
                z = c3147e.f7234e;
            }
            arrayList.add(new C8874e(enumC0698e, z, C0193e.f1409e));
        }
        return C3147e.vip(c3147e, arrayList, null, 0L, 239);
    }
}
