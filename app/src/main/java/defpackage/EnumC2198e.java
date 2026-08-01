package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2198e implements Iterator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2198e[] f5588e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC2198e f5589e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eُؓۤ] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        f5589e = r0;
        f5588e = new EnumC2198e[]{r0};
    }

    public static EnumC2198e valueOf(String str) {
        return (EnumC2198e) Enum.valueOf(EnumC2198e.class, str);
    }

    public static EnumC2198e[] values() {
        return (EnumC2198e[]) f5588e.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2301e.admob("no calls to next() since the last call to remove()", false);
    }
}
