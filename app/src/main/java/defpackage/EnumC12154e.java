package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC12154e implements Executor {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC12154e[] f24435e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final Handler f24436e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC12154e f24437e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eِٟۨ] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        f24437e = r0;
        f24435e = new EnumC12154e[]{r0};
        f24436e = new Handler(Looper.getMainLooper());
    }

    public static EnumC12154e valueOf(String str) {
        return (EnumC12154e) Enum.valueOf(EnumC12154e.class, str);
    }

    public static EnumC12154e[] values() {
        return (EnumC12154e[]) f24435e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f24436e.post(runnable);
    }
}
