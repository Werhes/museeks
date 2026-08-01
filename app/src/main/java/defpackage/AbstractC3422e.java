package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3422e {
    public static final /* synthetic */ int ad = 0;

    static {
        new IllegalStateException("This class has not been modified by the Realm Compiler Plugin. Has the Realm Gradle Plugin been applied to the project with this model class?");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.InterfaceC14287e ad(defpackage.C17974e r14, defpackage.C16981e r15, defpackage.InterfaceC14287e r16, int r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3422e.ad(e٘ۙؒ, eْٗۚ, eٟٓ۠, int, java.util.Map):eٟٓ۠");
    }

    public static final InterfaceC10518e vip(C17974e c17974e, C16981e c16981e, InterfaceC7227e interfaceC7227e, String str, realm_value_t realm_value_tVar, int i) {
        LongPointerWrapper longPointerWrapper;
        NativePointer nativePointer = c16981e.f33290e;
        long j = c16981e.advert().metrica(str).vip;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_object_create_with_primary_key(ptr$cinterop_release, j, realm_value_t.vip(realm_value_tVar), realm_value_tVar), false, 2, null);
        } else {
            if (m2467class != 1) {
                throw new C14803e(10);
            }
            long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
            int i3 = AbstractC6026e.ad;
            longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_object_get_or_create_with_primary_key(ptr$cinterop_release2, j, realm_value_t.vip(realm_value_tVar), realm_value_tVar, new boolean[]{false}), false, 2, null);
        }
        return AbstractC15792e.subscription(longPointerWrapper, interfaceC7227e, c17974e, c16981e);
    }
}
