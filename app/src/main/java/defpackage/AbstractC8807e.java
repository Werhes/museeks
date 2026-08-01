package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8807e extends AbstractC10060e implements InterfaceC14666e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C5363e f17713e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC3529e f17714e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final LongPointerWrapper f17715e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C5363e f17716e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C5363e f17717e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13655e f17718e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5363e f17719e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C5363e f17720e;

    public AbstractC8807e(C13655e c13655e, LongPointerWrapper longPointerWrapper, InterfaceC3529e interfaceC3529e) {
        this.f17718e = c13655e;
        this.f17715e = longPointerWrapper;
        this.f17714e = interfaceC3529e;
        final int i = 0;
        this.f17717e = new C5363e(new Function0(this) { // from class: eٍٟٔ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC8807e f28857e;

            {
                this.f28857e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                int i4 = 0;
                AbstractC8807e abstractC8807e = this.f28857e;
                switch (i2) {
                    case 0:
                        long[] jArr = {0};
                        long ptr$cinterop_release = abstractC8807e.f17715e.getPtr$cinterop_release();
                        int i5 = AbstractC6026e.ad;
                        realmcJNI.realm_dictionary_get_keys(ptr$cinterop_release, new long[1], jArr);
                        long j = jArr[0];
                        if (j != 0) {
                            return new LongPointerWrapper(j, false, 2, null);
                        }
                        throw new IllegalArgumentException("There was an error retrieving the dictionary keys.");
                    case 1:
                        long ptr$cinterop_release2 = abstractC8807e.f17715e.getPtr$cinterop_release();
                        int i6 = AbstractC6026e.ad;
                        return new LongPointerWrapper(realmcJNI.realm_dictionary_to_results(ptr$cinterop_release2), false, 2, null);
                    case 2:
                        InterfaceC3529e interfaceC3529e2 = abstractC8807e.f17714e;
                        interfaceC3529e2.yandex().mo3328goto();
                        return new C16300e(abstractC8807e.f17715e, interfaceC3529e2, abstractC8807e.f17718e, i3);
                    case 3:
                        InterfaceC3529e interfaceC3529e3 = abstractC8807e.f17714e;
                        interfaceC3529e3.yandex().mo3328goto();
                        return new C16300e((NativePointer) abstractC8807e.f17717e.getValue(), interfaceC3529e3, abstractC8807e.f17718e, i4);
                    default:
                        InterfaceC3529e interfaceC3529e4 = abstractC8807e.f17714e;
                        interfaceC3529e4.yandex().mo3328goto();
                        return new C16922e((NativePointer) abstractC8807e.f17713e.getValue(), interfaceC3529e4, abstractC8807e.f17718e);
                }
            }
        });
        final int i2 = 1;
        this.f17713e = new C5363e(new Function0(this) { // from class: eٍٟٔ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC8807e f28857e;

            {
                this.f28857e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 1;
                int i4 = 0;
                AbstractC8807e abstractC8807e = this.f28857e;
                switch (i22) {
                    case 0:
                        long[] jArr = {0};
                        long ptr$cinterop_release = abstractC8807e.f17715e.getPtr$cinterop_release();
                        int i5 = AbstractC6026e.ad;
                        realmcJNI.realm_dictionary_get_keys(ptr$cinterop_release, new long[1], jArr);
                        long j = jArr[0];
                        if (j != 0) {
                            return new LongPointerWrapper(j, false, 2, null);
                        }
                        throw new IllegalArgumentException("There was an error retrieving the dictionary keys.");
                    case 1:
                        long ptr$cinterop_release2 = abstractC8807e.f17715e.getPtr$cinterop_release();
                        int i6 = AbstractC6026e.ad;
                        return new LongPointerWrapper(realmcJNI.realm_dictionary_to_results(ptr$cinterop_release2), false, 2, null);
                    case 2:
                        InterfaceC3529e interfaceC3529e2 = abstractC8807e.f17714e;
                        interfaceC3529e2.yandex().mo3328goto();
                        return new C16300e(abstractC8807e.f17715e, interfaceC3529e2, abstractC8807e.f17718e, i3);
                    case 3:
                        InterfaceC3529e interfaceC3529e3 = abstractC8807e.f17714e;
                        interfaceC3529e3.yandex().mo3328goto();
                        return new C16300e((NativePointer) abstractC8807e.f17717e.getValue(), interfaceC3529e3, abstractC8807e.f17718e, i4);
                    default:
                        InterfaceC3529e interfaceC3529e4 = abstractC8807e.f17714e;
                        interfaceC3529e4.yandex().mo3328goto();
                        return new C16922e((NativePointer) abstractC8807e.f17713e.getValue(), interfaceC3529e4, abstractC8807e.f17718e);
                }
            }
        });
        final int i3 = 2;
        this.f17720e = new C5363e(new Function0(this) { // from class: eٍٟٔ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC8807e f28857e;

            {
                this.f28857e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 1;
                int i4 = 0;
                AbstractC8807e abstractC8807e = this.f28857e;
                switch (i22) {
                    case 0:
                        long[] jArr = {0};
                        long ptr$cinterop_release = abstractC8807e.f17715e.getPtr$cinterop_release();
                        int i5 = AbstractC6026e.ad;
                        realmcJNI.realm_dictionary_get_keys(ptr$cinterop_release, new long[1], jArr);
                        long j = jArr[0];
                        if (j != 0) {
                            return new LongPointerWrapper(j, false, 2, null);
                        }
                        throw new IllegalArgumentException("There was an error retrieving the dictionary keys.");
                    case 1:
                        long ptr$cinterop_release2 = abstractC8807e.f17715e.getPtr$cinterop_release();
                        int i6 = AbstractC6026e.ad;
                        return new LongPointerWrapper(realmcJNI.realm_dictionary_to_results(ptr$cinterop_release2), false, 2, null);
                    case 2:
                        InterfaceC3529e interfaceC3529e2 = abstractC8807e.f17714e;
                        interfaceC3529e2.yandex().mo3328goto();
                        return new C16300e(abstractC8807e.f17715e, interfaceC3529e2, abstractC8807e.f17718e, i32);
                    case 3:
                        InterfaceC3529e interfaceC3529e3 = abstractC8807e.f17714e;
                        interfaceC3529e3.yandex().mo3328goto();
                        return new C16300e((NativePointer) abstractC8807e.f17717e.getValue(), interfaceC3529e3, abstractC8807e.f17718e, i4);
                    default:
                        InterfaceC3529e interfaceC3529e4 = abstractC8807e.f17714e;
                        interfaceC3529e4.yandex().mo3328goto();
                        return new C16922e((NativePointer) abstractC8807e.f17713e.getValue(), interfaceC3529e4, abstractC8807e.f17718e);
                }
            }
        });
        final int i4 = 3;
        this.f17719e = new C5363e(new Function0(this) { // from class: eٍٟٔ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC8807e f28857e;

            {
                this.f28857e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                int i32 = 1;
                int i42 = 0;
                AbstractC8807e abstractC8807e = this.f28857e;
                switch (i22) {
                    case 0:
                        long[] jArr = {0};
                        long ptr$cinterop_release = abstractC8807e.f17715e.getPtr$cinterop_release();
                        int i5 = AbstractC6026e.ad;
                        realmcJNI.realm_dictionary_get_keys(ptr$cinterop_release, new long[1], jArr);
                        long j = jArr[0];
                        if (j != 0) {
                            return new LongPointerWrapper(j, false, 2, null);
                        }
                        throw new IllegalArgumentException("There was an error retrieving the dictionary keys.");
                    case 1:
                        long ptr$cinterop_release2 = abstractC8807e.f17715e.getPtr$cinterop_release();
                        int i6 = AbstractC6026e.ad;
                        return new LongPointerWrapper(realmcJNI.realm_dictionary_to_results(ptr$cinterop_release2), false, 2, null);
                    case 2:
                        InterfaceC3529e interfaceC3529e2 = abstractC8807e.f17714e;
                        interfaceC3529e2.yandex().mo3328goto();
                        return new C16300e(abstractC8807e.f17715e, interfaceC3529e2, abstractC8807e.f17718e, i32);
                    case 3:
                        InterfaceC3529e interfaceC3529e3 = abstractC8807e.f17714e;
                        interfaceC3529e3.yandex().mo3328goto();
                        return new C16300e((NativePointer) abstractC8807e.f17717e.getValue(), interfaceC3529e3, abstractC8807e.f17718e, i42);
                    default:
                        InterfaceC3529e interfaceC3529e4 = abstractC8807e.f17714e;
                        interfaceC3529e4.yandex().mo3328goto();
                        return new C16922e((NativePointer) abstractC8807e.f17713e.getValue(), interfaceC3529e4, abstractC8807e.f17718e);
                }
            }
        });
        final int i5 = 4;
        this.f17716e = new C5363e(new Function0(this) { // from class: eٍٟٔ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC8807e f28857e;

            {
                this.f28857e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 1;
                int i42 = 0;
                AbstractC8807e abstractC8807e = this.f28857e;
                switch (i22) {
                    case 0:
                        long[] jArr = {0};
                        long ptr$cinterop_release = abstractC8807e.f17715e.getPtr$cinterop_release();
                        int i52 = AbstractC6026e.ad;
                        realmcJNI.realm_dictionary_get_keys(ptr$cinterop_release, new long[1], jArr);
                        long j = jArr[0];
                        if (j != 0) {
                            return new LongPointerWrapper(j, false, 2, null);
                        }
                        throw new IllegalArgumentException("There was an error retrieving the dictionary keys.");
                    case 1:
                        long ptr$cinterop_release2 = abstractC8807e.f17715e.getPtr$cinterop_release();
                        int i6 = AbstractC6026e.ad;
                        return new LongPointerWrapper(realmcJNI.realm_dictionary_to_results(ptr$cinterop_release2), false, 2, null);
                    case 2:
                        InterfaceC3529e interfaceC3529e2 = abstractC8807e.f17714e;
                        interfaceC3529e2.yandex().mo3328goto();
                        return new C16300e(abstractC8807e.f17715e, interfaceC3529e2, abstractC8807e.f17718e, i32);
                    case 3:
                        InterfaceC3529e interfaceC3529e3 = abstractC8807e.f17714e;
                        interfaceC3529e3.yandex().mo3328goto();
                        return new C16300e((NativePointer) abstractC8807e.f17717e.getValue(), interfaceC3529e3, abstractC8807e.f17718e, i42);
                    default:
                        InterfaceC3529e interfaceC3529e4 = abstractC8807e.f17714e;
                        interfaceC3529e4.yandex().mo3328goto();
                        return new C16922e((NativePointer) abstractC8807e.f17713e.getValue(), interfaceC3529e4, abstractC8807e.f17718e);
                }
            }
        });
    }

    @Override // defpackage.AbstractC10060e
    public final Set ad() {
        return (Set) this.f17720e.getValue();
    }

    @Override // defpackage.AbstractC10060e
    public final Collection appmetrica() {
        return (Collection) this.f17716e.getValue();
    }

    @Override // defpackage.InterfaceC16883e
    public final InterfaceC14666e billing(AbstractC14297e abstractC14297e) {
        C16981e yandex = abstractC14297e.yandex();
        C3050e c3050e = (C3050e) this;
        NativePointer nativePointer = yandex.f33290e;
        long[] jArr = {0};
        long ptr$cinterop_release = c3050e.f17715e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new AbstractC8807e(c3050e.f17718e, longPointerWrapper, c3050e.f17714e.metrica(yandex, longPointerWrapper));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f17714e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f17714e.containsValue(obj);
    }

    @Override // defpackage.InterfaceC14666e
    public final boolean isValid() {
        LongPointerWrapper longPointerWrapper = this.f17715e;
        if (longPointerWrapper.isReleased()) {
            return false;
        }
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return realmcJNI.realm_dictionary_is_valid(ptr$cinterop_release);
    }

    @Override // defpackage.AbstractC10060e
    public final int metrica() {
        return this.f17714e.appmetrica();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f17714e.loadAd(obj, obj2, 2, new LinkedHashMap());
    }

    @Override // defpackage.InterfaceC8632e
    public final InterfaceC16883e subscription() {
        return this;
    }

    @Override // defpackage.InterfaceC14666e
    public final LongPointerWrapper tapsense(NativePointer nativePointer, C0912e c0912e) {
        long ptr$cinterop_release = this.f17715e.getPtr$cinterop_release();
        long ptr$cinterop_release2 = nativePointer != null ? ((LongPointerWrapper) nativePointer).getPtr$cinterop_release() : 0L;
        C6594e c6594e = new C6594e(24, c0912e);
        int i = AbstractC6026e.ad;
        return new LongPointerWrapper(realmcJNI.register_notification_cb(ptr$cinterop_release, 4, ptr$cinterop_release2, c6594e), false);
    }

    @Override // defpackage.AbstractC10060e
    public final Set vip() {
        return (Set) this.f17719e.getValue();
    }
}
