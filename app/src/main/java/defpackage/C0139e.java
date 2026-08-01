package defpackage;

import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139e {
    public static final C0139e ad = new Object();

    public static void ad(String str, String str2, String str3) {
        AppActivity appActivity = C5658e.vip;
        if (appActivity != null) {
            appActivity.isVip(new C15820e(Integer.parseInt(str2), 8, Long.parseLong(str), str3));
        }
    }

    public static void vip(String str, String str2, String str3) {
        AppActivity appActivity = C5658e.vip;
        if (appActivity != null) {
            appActivity.isVip(new C15820e(Integer.parseInt(str2), Long.parseLong(str), str3, true));
        }
    }
}
