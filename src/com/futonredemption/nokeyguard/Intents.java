package com.futonredemption.nokeyguard;

import android.content.Context;
import android.content.Intent;

public class Intents {
	public static final Intent disableKeyguard(Context context) {
		final Intent result = new Intent(context, DisableKeyguardService.class);
		result.putExtra(DisableKeyguardService.EXTRA_RemoteAction, DisableKeyguardService.RemoteAction_DisableKeyguard);
		result.putExtra(DisableKeyguardService.EXTRA_ForceNotify, true);

		return result;
	}

	public static final Intent enableKeyguard(Context context) {
		final Intent result = new Intent(context, DisableKeyguardService.class);
		result.putExtra(DisableKeyguardService.EXTRA_RemoteAction, DisableKeyguardService.RemoteAction_EnableKeyguard);
		result.putExtra(DisableKeyguardService.EXTRA_ForceNotify, true);
		return result;
	}

	public static final Intent refreshWidgets(Context context) {
		final Intent result = new Intent(context, DisableKeyguardService.class);
		result.putExtra(DisableKeyguardService.EXTRA_RemoteAction, DisableKeyguardService.RemoteAction_RefreshWidgets);
		result.putExtra(DisableKeyguardService.EXTRA_ForceNotify, false);
		return result;
	}
}
