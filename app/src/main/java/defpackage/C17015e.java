package defpackage;

import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17015e implements InterfaceC12330e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C17015e f33328e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C6575e f33329e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final TreeMap f33330e;

    static {
        C6575e c6575e = new C6575e(22);
        f33329e = c6575e;
        f33328e = new C17015e(new TreeMap(c6575e));
    }

    public C17015e(TreeMap treeMap) {
        this.f33330e = treeMap;
    }

    public static C17015e vip(InterfaceC12330e interfaceC12330e) {
        if (C17015e.class.equals(interfaceC12330e.getClass())) {
            return (C17015e) interfaceC12330e;
        }
        TreeMap treeMap = new TreeMap(f33329e);
        for (C14326e c14326e : interfaceC12330e.admob()) {
            Set<EnumC13734e> inmobi = interfaceC12330e.inmobi(c14326e);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC13734e enumC13734e : inmobi) {
                arrayMap.put(enumC13734e, interfaceC12330e.premium(c14326e, enumC13734e));
            }
            treeMap.put(c14326e, arrayMap);
        }
        return new C17015e(treeMap);
    }

    @Override // defpackage.InterfaceC12330e
    public final Set admob() {
        return DesugarCollections.unmodifiableSet(this.f33330e.keySet());
    }

    @Override // defpackage.InterfaceC12330e
    /* renamed from: catch */
    public final EnumC13734e mo810catch(C14326e c14326e) {
        Map map = (Map) this.f33330e.get(c14326e);
        if (map != null) {
            return (EnumC13734e) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + c14326e);
    }

    @Override // defpackage.InterfaceC12330e
    /* renamed from: extends */
    public final boolean mo812extends(C14326e c14326e) {
        return this.f33330e.containsKey(c14326e);
    }

    @Override // defpackage.InterfaceC12330e
    public final Set inmobi(C14326e c14326e) {
        Map map = (Map) this.f33330e.get(c14326e);
        return map == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.InterfaceC12330e
    public final void metrica(C11565e c11565e) {
        for (Map.Entry entry : this.f33330e.tailMap(new C14326e("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((C14326e) entry.getKey()).ad.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            C14326e c14326e = (C14326e) entry.getKey();
            C17974e c17974e = (C17974e) c11565e.f23232e;
            InterfaceC12330e interfaceC12330e = (InterfaceC12330e) c11565e.f23231e;
            ((C4069e) c17974e.f35233e).billing(c14326e, interfaceC12330e.mo810catch(c14326e), interfaceC12330e.subscription(c14326e));
        }
    }

    @Override // defpackage.InterfaceC12330e
    public final Object premium(C14326e c14326e, EnumC13734e enumC13734e) {
        Map map = (Map) this.f33330e.get(c14326e);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + c14326e);
        }
        if (map.containsKey(enumC13734e)) {
            return map.get(enumC13734e);
        }
        throw new IllegalArgumentException("Option does not exist: " + c14326e + " with priority=" + enumC13734e);
    }

    @Override // defpackage.InterfaceC12330e
    public final Object smaato(C14326e c14326e, Object obj) {
        Map map = (Map) this.f33330e.get(c14326e);
        return map == null ? obj : map.get((EnumC13734e) Collections.min(map.keySet()));
    }

    @Override // defpackage.InterfaceC12330e
    public final Object subscription(C14326e c14326e) {
        Map map = (Map) this.f33330e.get(c14326e);
        if (map != null) {
            return map.get((EnumC13734e) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + c14326e);
    }
}
