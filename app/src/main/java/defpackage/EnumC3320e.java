package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3320e implements Executor {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3320e[] f7488e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC3320e f7489e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٍّؕ] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        f7489e = r0;
        f7488e = new EnumC3320e[]{r0};
    }

    public static EnumC3320e valueOf(String str) {
        return (EnumC3320e) Enum.valueOf(EnumC3320e.class, str);
    }

    public static EnumC3320e[] values() {
        return (EnumC3320e[]) f7488e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
