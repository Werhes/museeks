package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leًٕۖ;", "Leِٝؓ;", "Leًؕ٘;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eًٕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8128e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object[] f16502e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f16503e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final PointerInputEventHandler f16504e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f16505e;

    public C8128e(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.f16505e = obj;
        this.f16503e = obj2;
        this.f16502e = objArr;
        this.f16504e = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8128e)) {
            return false;
        }
        C8128e c8128e = (C8128e) obj;
        Object[] objArr = c8128e.f16502e;
        if (!AbstractC7890e.billing(this.f16505e, c8128e.f16505e) || !AbstractC7890e.billing(this.f16503e, c8128e.f16503e)) {
            return false;
        }
        Object[] objArr2 = this.f16502e;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f16504e == c8128e.f16504e;
    }

    public final int hashCode() {
        Object obj = this.f16505e;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f16503e;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f16502e;
        return this.f16504e.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C3427e(this.f16505e, this.f16503e, this.f16502e, this.f16504e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C3427e c3427e = (C3427e) abstractC13616e;
        Object obj = c3427e.f7666e;
        Object obj2 = this.f16505e;
        boolean z = !AbstractC7890e.billing(obj, obj2);
        c3427e.f7666e = obj2;
        Object obj3 = c3427e.f7667e;
        Object obj4 = this.f16503e;
        if (!AbstractC7890e.billing(obj3, obj4)) {
            z = true;
        }
        c3427e.f7667e = obj4;
        Object[] objArr = c3427e.f7665e;
        Object[] objArr2 = this.f16502e;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        c3427e.f7665e = objArr2;
        Class<?> cls = c3427e.f7664e.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f16504e;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            c3427e.m1363e();
        }
        c3427e.f7664e = pointerInputEventHandler;
    }
}
