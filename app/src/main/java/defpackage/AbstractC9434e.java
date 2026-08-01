package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9434e implements Map, Serializable, j$.util.Map {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient AbstractCollection f18771e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient AbstractCollection f18772e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public transient AbstractCollection f18773e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18774e;

    public /* synthetic */ AbstractC9434e(int i) {
        this.f18774e = i;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v4 ??, r4v10 ??, r4v5 ??, r4v8 ??, r4v6 ??, r4v7 ??, r4v9 ??, r4v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:695)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public static void ad(java.util.Set r18) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9434e.ad(java.util.Set):void");
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f18774e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        int i = this.f18774e;
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        int i = this.f18774e;
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i = this.f18774e;
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f18774e) {
            case 0:
                return get(obj) != null;
            case 1:
                return get(obj) != null;
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f18774e) {
            case 0:
                C4995e c4995e = (C4995e) this.f18773e;
                if (c4995e == null) {
                    C12949e c12949e = (C12949e) this;
                    C4995e c4995e2 = new C4995e(1, c12949e.f25803e, c12949e.f25804e);
                    this.f18773e = c4995e2;
                    c4995e = c4995e2;
                }
                return c4995e.contains(obj);
            case 1:
                C1829e c1829e = (C1829e) this.f18773e;
                if (c1829e == null) {
                    C2204e c2204e = (C2204e) this;
                    C1829e c1829e2 = new C1829e(1, c2204e.f5592e, c2204e.f5593e);
                    this.f18773e = c1829e2;
                    c1829e = c1829e2;
                }
                return c1829e.contains(obj);
            default:
                C14079e c14079e = (C14079e) this.f18773e;
                if (c14079e == null) {
                    C14079e c14079e2 = new C14079e(1, ((C10502e) this).f20720e);
                    this.f18773e = c14079e2;
                    c14079e = c14079e2;
                }
                return c14079e.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f18774e) {
            case 0:
                C2859e c2859e = (C2859e) this.f18772e;
                if (c2859e != null) {
                    return c2859e;
                }
                C12949e c12949e = (C12949e) this;
                C2859e c2859e2 = new C2859e(c12949e, c12949e.f25804e, c12949e.f25803e);
                this.f18772e = c2859e2;
                return c2859e2;
            case 1:
                C11551e c11551e = (C11551e) this.f18772e;
                if (c11551e != null) {
                    return c11551e;
                }
                C2204e c2204e = (C2204e) this;
                C11551e c11551e2 = new C11551e(c2204e, c2204e.f5593e, c2204e.f5592e);
                this.f18772e = c11551e2;
                return c11551e2;
            default:
                C7618e c7618e = (C7618e) this.f18772e;
                if (c7618e != null) {
                    return c7618e;
                }
                C10502e c10502e = (C10502e) this;
                C7618e c7618e2 = new C7618e(c10502e, c10502e.f20720e);
                this.f18772e = c7618e2;
                return c7618e2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f18774e) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof java.util.Map) {
                    return entrySet().equals(((java.util.Map) obj).entrySet());
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof java.util.Map) {
                    return entrySet().equals(((java.util.Map) obj).entrySet());
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof java.util.Map) {
                    return entrySet().equals(((java.util.Map) obj).entrySet());
                }
                return false;
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        int i = this.f18774e;
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f18774e) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            default:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f18774e) {
            case 0:
                C2859e c2859e = (C2859e) this.f18772e;
                if (c2859e == null) {
                    C12949e c12949e = (C12949e) this;
                    C2859e c2859e2 = new C2859e(c12949e, c12949e.f25804e, c12949e.f25803e);
                    this.f18772e = c2859e2;
                    c2859e = c2859e2;
                }
                Iterator it = c2859e.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i += next != null ? next.hashCode() : 0;
                }
                return i;
            case 1:
                C11551e c11551e = (C11551e) this.f18772e;
                if (c11551e == null) {
                    C2204e c2204e = (C2204e) this;
                    C11551e c11551e2 = new C11551e(c2204e, c2204e.f5593e, c2204e.f5592e);
                    this.f18772e = c11551e2;
                    c11551e = c11551e2;
                }
                Iterator it2 = c11551e.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i2 += next2 != null ? next2.hashCode() : 0;
                }
                return i2;
            default:
                C7618e c7618e = (C7618e) this.f18772e;
                if (c7618e == null) {
                    C10502e c10502e = (C10502e) this;
                    C7618e c7618e2 = new C7618e(c10502e, c10502e.f20720e);
                    this.f18772e = c7618e2;
                    c7618e = c7618e2;
                }
                Iterator it3 = c7618e.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    i3 += next3 != null ? next3.hashCode() : 0;
                }
                return i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f18774e) {
            case 0:
                return ((C12949e) this).size() == 0;
            case 1:
                return ((C2204e) this).size() == 0;
            default:
                return false;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f18774e) {
            case 0:
                C1836e c1836e = (C1836e) this.f18771e;
                if (c1836e != null) {
                    return c1836e;
                }
                C12949e c12949e = (C12949e) this;
                C1836e c1836e2 = new C1836e(c12949e, new C4995e(0, c12949e.f25803e, c12949e.f25804e));
                this.f18771e = c1836e2;
                return c1836e2;
            case 1:
                C12015e c12015e = (C12015e) this.f18771e;
                if (c12015e != null) {
                    return c12015e;
                }
                C2204e c2204e = (C2204e) this;
                C12015e c12015e2 = new C12015e(c2204e, new C1829e(0, c2204e.f5592e, c2204e.f5593e));
                this.f18771e = c12015e2;
                return c12015e2;
            default:
                C3449e c3449e = (C3449e) this.f18771e;
                if (c3449e != null) {
                    return c3449e;
                }
                C10502e c10502e = (C10502e) this;
                C3449e c3449e2 = new C3449e(c10502e, new C14079e(0, c10502e.f20720e));
                this.f18771e = c3449e2;
                return c3449e2;
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i = this.f18774e;
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f18774e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        switch (this.f18774e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        int i = this.f18774e;
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f18774e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        int i = this.f18774e;
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        int i = this.f18774e;
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        int i = this.f18774e;
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        int i = this.f18774e;
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        switch (this.f18774e) {
            case 0:
                int i = ((C12949e) this).f25803e;
                if (i < 0) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i, "size cannot be negative but was: "));
                }
                StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
                sb.append('{');
                Iterator it = ((C2859e) entrySet()).iterator();
                boolean z = true;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                int i2 = ((C2204e) this).f5592e;
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC8647e.isPro(i2, "size cannot be negative but was: ", new StringBuilder(String.valueOf(i2).length() + 33)));
                }
                StringBuilder sb2 = new StringBuilder((int) Math.min(i2 * 8, 1073741824L));
                sb2.append('{');
                Iterator it2 = ((C11551e) entrySet()).iterator();
                boolean z2 = true;
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z2) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z2 = false;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                boolean z3 = true;
                StringBuilder sb3 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb3.append('{');
                Iterator it3 = ((C7618e) entrySet()).iterator();
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    if (!z3) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z3 = false;
                }
                sb3.append('}');
                return sb3.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f18774e) {
            case 0:
                C4995e c4995e = (C4995e) this.f18773e;
                if (c4995e != null) {
                    return c4995e;
                }
                C12949e c12949e = (C12949e) this;
                C4995e c4995e2 = new C4995e(1, c12949e.f25803e, c12949e.f25804e);
                this.f18773e = c4995e2;
                return c4995e2;
            case 1:
                C1829e c1829e = (C1829e) this.f18773e;
                if (c1829e != null) {
                    return c1829e;
                }
                C2204e c2204e = (C2204e) this;
                C1829e c1829e2 = new C1829e(1, c2204e.f5592e, c2204e.f5593e);
                this.f18773e = c1829e2;
                return c1829e2;
            default:
                C14079e c14079e = (C14079e) this.f18773e;
                if (c14079e != null) {
                    return c14079e;
                }
                C14079e c14079e2 = new C14079e(1, ((C10502e) this).f20720e);
                this.f18773e = c14079e2;
                return c14079e2;
        }
    }
}
