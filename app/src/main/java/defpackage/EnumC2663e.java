package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2663e implements Executor {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2663e[] f6528e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC2663e f6529e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؔٙؔ] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        f6529e = r0;
        f6528e = new EnumC2663e[]{r0};
    }

    public static EnumC2663e[] values() {
        return (EnumC2663e[]) f6528e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((HandlerC9134e) C6594e.m2212final().f13613e).post(runnable);
    }
}
