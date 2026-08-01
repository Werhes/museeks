package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_collection_move_t;
import io.realm.kotlin.internal.interop.realm_index_range_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۚ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14228e {
    public final Object ad;
    public final Object license;
    public Object metrica;
    public final Serializable vip;

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, io.realm.kotlin.internal.interop.realm_collection_move_t] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, io.realm.kotlin.internal.interop.realm_collection_move_t] */
    /* JADX WARN: Type inference failed for: r8v8, types: [eؘُؒ[], java.io.Serializable] */
    public AbstractC14228e(NativePointer nativePointer) {
        realm_collection_move_t realm_collection_move_tVar;
        realm_collection_move_t realm_collection_move_tVar2;
        long[] jArr = new long[1];
        long[] jArr2 = new long[1];
        long[] jArr3 = new long[1];
        long[] jArr4 = new long[1];
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_collection_changes_get_num_changes(ptr$cinterop_release, jArr2, jArr, jArr3, jArr4, new boolean[1], new boolean[1]);
        long[] jArr5 = new long[(int) jArr[0]];
        int i2 = (int) jArr3[0];
        long[] jArr6 = new long[i2];
        long[] jArr7 = new long[i2];
        long[] jArr8 = new long[(int) jArr2[0]];
        long new_collectionMoveArray = realmcJNI.new_collectionMoveArray((int) jArr4[0]);
        if (new_collectionMoveArray == 0) {
            realm_collection_move_tVar = null;
        } else {
            ?? obj = new Object();
            obj.ad = new_collectionMoveArray;
            realm_collection_move_tVar = obj;
        }
        long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
        long j = jArr2[0];
        long j2 = jArr[0];
        long j3 = jArr3[0];
        realm_collection_move_t realm_collection_move_tVar3 = realm_collection_move_tVar;
        realmcJNI.realm_collection_changes_get_changes(ptr$cinterop_release2, jArr8, j, jArr5, j2, jArr6, j3, jArr7, j3, realm_collection_move_tVar == null ? 0L : realm_collection_move_tVar.ad, realm_collection_move_tVar3, jArr4[0]);
        int length = jArr5.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = (int) jArr5[i3];
        }
        int length2 = jArr8.length;
        int[] iArr2 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr2[i4] = (int) jArr8[i4];
        }
        int length3 = jArr6.length;
        int[] iArr3 = new int[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            iArr3[i5] = (int) jArr6[i5];
        }
        int length4 = jArr7.length;
        int[] iArr4 = new int[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            iArr4[i6] = (int) jArr7[i6];
        }
        realmcJNI.delete_collectionMoveArray(realm_collection_move_tVar3 == null ? 0L : realm_collection_move_tVar3.ad, realm_collection_move_tVar3);
        long[] jArr9 = new long[1];
        long[] jArr10 = new long[1];
        long[] jArr11 = new long[1];
        long[] jArr12 = new long[1];
        realmcJNI.realm_collection_changes_get_num_ranges(longPointerWrapper.getPtr$cinterop_release(), jArr10, jArr9, jArr11, jArr12);
        realm_index_range_t vip = AbstractC6026e.vip((int) jArr9[0]);
        realm_index_range_t vip2 = AbstractC6026e.vip((int) jArr11[0]);
        realm_index_range_t vip3 = AbstractC6026e.vip((int) jArr11[0]);
        realm_index_range_t vip4 = AbstractC6026e.vip((int) jArr10[0]);
        long new_collectionMoveArray2 = realmcJNI.new_collectionMoveArray((int) jArr12[0]);
        if (new_collectionMoveArray2 == 0) {
            realm_collection_move_tVar2 = null;
        } else {
            ?? obj2 = new Object();
            obj2.ad = new_collectionMoveArray2;
            realm_collection_move_tVar2 = obj2;
        }
        long ptr$cinterop_release3 = longPointerWrapper.getPtr$cinterop_release();
        long j4 = jArr10[0];
        long j5 = jArr9[0];
        long j6 = jArr11[0];
        realm_collection_move_t realm_collection_move_tVar4 = realm_collection_move_tVar2;
        realmcJNI.realm_collection_changes_get_ranges(ptr$cinterop_release3, realm_index_range_t.ad(vip4), vip4, j4, realm_index_range_t.ad(vip), vip, j5, realm_index_range_t.ad(vip2), vip2, j6, realm_index_range_t.ad(vip3), vip3, j6, realm_collection_move_tVar2 == null ? 0L : realm_collection_move_tVar2.ad, realm_collection_move_tVar4, jArr12[0]);
        int i7 = (int) jArr10[0];
        C5570e[] c5570eArr = new C5570e[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            realm_index_range_t ad = AbstractC6026e.ad(vip4, i8);
            int realm_index_range_t_from_get = (int) realmcJNI.realm_index_range_t_from_get(ad.ad, ad);
            realm_index_range_t ad2 = AbstractC6026e.ad(vip4, i8);
            c5570eArr[i8] = new C5570e(realm_index_range_t_from_get, ((int) realmcJNI.realm_index_range_t_to_get(ad2.ad, ad2)) - realm_index_range_t_from_get);
        }
        this.ad = c5570eArr;
        int i9 = (int) jArr9[0];
        ?? r8 = new C5570e[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            realm_index_range_t ad3 = AbstractC6026e.ad(vip, i10);
            int realm_index_range_t_from_get2 = (int) realmcJNI.realm_index_range_t_from_get(ad3.ad, ad3);
            realm_index_range_t ad4 = AbstractC6026e.ad(vip, i10);
            r8[i10] = new C5570e(realm_index_range_t_from_get2, ((int) realmcJNI.realm_index_range_t_to_get(ad4.ad, ad4)) - realm_index_range_t_from_get2);
        }
        this.vip = r8;
        int i11 = (int) jArr11[0];
        C5570e[] c5570eArr2 = new C5570e[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            realm_index_range_t ad5 = AbstractC6026e.ad(vip2, i12);
            int realm_index_range_t_from_get3 = (int) realmcJNI.realm_index_range_t_from_get(ad5.ad, ad5);
            realm_index_range_t ad6 = AbstractC6026e.ad(vip2, i12);
            c5570eArr2[i12] = new C5570e(realm_index_range_t_from_get3, ((int) realmcJNI.realm_index_range_t_to_get(ad6.ad, ad6)) - realm_index_range_t_from_get3);
        }
        this.metrica = c5570eArr2;
        int i13 = (int) jArr11[0];
        C5570e[] c5570eArr3 = new C5570e[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            realm_index_range_t ad7 = AbstractC6026e.ad(vip3, i14);
            int realm_index_range_t_from_get4 = (int) realmcJNI.realm_index_range_t_from_get(ad7.ad, ad7);
            realm_index_range_t ad8 = AbstractC6026e.ad(vip3, i14);
            c5570eArr3[i14] = new C5570e(realm_index_range_t_from_get4, ((int) realmcJNI.realm_index_range_t_to_get(ad8.ad, ad8)) - realm_index_range_t_from_get4);
        }
        this.license = c5570eArr3;
        realmcJNI.delete_indexRangeArray(vip.ad, vip);
        realmcJNI.delete_indexRangeArray(vip2.ad, vip2);
        realmcJNI.delete_indexRangeArray(vip3.ad, vip3);
        realmcJNI.delete_indexRangeArray(vip4.ad, vip4);
        realmcJNI.delete_collectionMoveArray(realm_collection_move_tVar4 == null ? 0L : realm_collection_move_tVar4.ad, realm_collection_move_tVar4);
    }

    public AbstractC14228e(String str) {
        AbstractC5942e.vip(str);
        this.vip = str;
        this.ad = new C18482e("MediaControlChannel", null);
        this.license = DesugarCollections.synchronizedList(new ArrayList());
    }

    public void ad(C9427e c9427e) {
        ((List) this.license).add(c9427e);
    }

    public long metrica() {
        C0912e c0912e = (C0912e) this.metrica;
        if (c0912e != null) {
            return ((AtomicLong) c0912e.f3331e).getAndIncrement();
        }
        C18482e c18482e = (C18482e) this.ad;
        Log.e(c18482e.ad, c18482e.license("Attempt to generate requestId without a sink", new Object[0]));
        return 0L;
    }

    public void vip(long j, String str) {
        int i = 0;
        Object[] objArr = {str, null};
        C18482e c18482e = (C18482e) this.ad;
        c18482e.getClass();
        String str2 = c18482e.ad;
        if (!Build.TYPE.equals("user") && c18482e.vip && Log.isLoggable(str2, 2)) {
            Log.v(str2, c18482e.license("Sending text message: %s to: %s", objArr));
        }
        C0912e c0912e = (C0912e) this.metrica;
        if (c0912e == null) {
            Log.e(str2, c18482e.license("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        String str3 = (String) this.vip;
        InterfaceC9591e interfaceC9591e = (InterfaceC9591e) c0912e.f3332e;
        if (interfaceC9591e == null) {
            throw new IllegalStateException("Device is not connected");
        }
        C4612e c4612e = (C4612e) interfaceC9591e;
        AbstractC5942e.vip(str3);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str.length() > 524288) {
            C18482e c18482e2 = C4612e.f9940interface;
            Log.w(c18482e2.ad, c18482e2.license("Message send failed. Message exceeds maximum size", new Object[0]));
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        C9321e ad = C0381e.ad();
        ad.ad = new C15093e(c4612e, str3, str, i);
        ad.appmetrica = 8405;
        c4612e.appmetrica(1, ad.ad()).metrica(new C3318e(c0912e, j, 7));
    }
}
